package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ListView: ImageVector
    get() {
        if (_listView != null) {
            return _listView!!
        }
        _listView = ImageVector.Builder(
            name = "ListView",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 11.4f)
        curveTo(2f, 10.2417f, 2.24173f, 10f, 3.4f, 10f)
        horizontalLineTo(20.6f)
        curveTo(21.7583f, 10f, 22f, 10.2417f, 22f, 11.4f)
        verticalLineTo(12.6f)
        curveTo(22f, 13.7583f, 21.7583f, 14f, 20.6f, 14f)
        horizontalLineTo(3.4f)
        curveTo(2.24173f, 14f, 2f, 13.7583f, 2f, 12.6f)
        verticalLineTo(11.4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 3.4f)
        curveTo(2f, 2.24173f, 2.24173f, 2f, 3.4f, 2f)
        horizontalLineTo(20.6f)
        curveTo(21.7583f, 2f, 22f, 2.24173f, 22f, 3.4f)
        verticalLineTo(4.6f)
        curveTo(22f, 5.75827f, 21.7583f, 6f, 20.6f, 6f)
        horizontalLineTo(3.4f)
        curveTo(2.24173f, 6f, 2f, 5.75827f, 2f, 4.6f)
        verticalLineTo(3.4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 19.4f)
        curveTo(2f, 18.2417f, 2.24173f, 18f, 3.4f, 18f)
        horizontalLineTo(20.6f)
        curveTo(21.7583f, 18f, 22f, 18.2417f, 22f, 19.4f)
        verticalLineTo(20.6f)
        curveTo(22f, 21.7583f, 21.7583f, 22f, 20.6f, 22f)
        horizontalLineTo(3.4f)
        curveTo(2.24173f, 22f, 2f, 21.7583f, 2f, 20.6f)
        verticalLineTo(19.4f)
        }
        }.build()

        return _listView!!
    }

private var _listView: ImageVector? = null
