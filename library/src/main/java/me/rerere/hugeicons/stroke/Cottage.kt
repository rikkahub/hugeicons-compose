package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cottage: ImageVector
    get() {
        if (_cottage != null) {
            return _cottage!!
        }
        _cottage = ImageVector.Builder(
            name = "Cottage",
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
        moveTo(3f, 21f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 21f)
        verticalLineTo(11f)
        curveTo(4f, 6.58172f, 7.58172f, 3f, 12f, 3f)
        curveTo(16.4183f, 3f, 20f, 6.58172f, 20f, 11f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 21f)
        verticalLineTo(18f)
        curveTo(9f, 16.1775f, 10.0596f, 15f, 12f, 15f)
        curveTo(13.9404f, 15f, 15f, 16.1775f, 15f, 18f)
        verticalLineTo(21f)
        }
        }.build()

        return _cottage!!
    }

private var _cottage: ImageVector? = null
