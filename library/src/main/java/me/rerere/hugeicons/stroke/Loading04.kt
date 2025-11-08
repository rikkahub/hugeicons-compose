package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Loading04: ImageVector
    get() {
        if (_loading04 != null) {
            return _loading04!!
        }
        _loading04 = ImageVector.Builder(
            name = "Loading04",
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
        moveTo(4f, 10f)
        horizontalLineTo(20f)
        curveTo(21.1046f, 10f, 22f, 10.8954f, 22f, 12f)
        curveTo(22f, 13.1046f, 21.1046f, 14f, 20f, 14f)
        horizontalLineTo(4f)
        curveTo(2.89543f, 14f, 2f, 13.1046f, 2f, 12f)
        curveTo(2f, 10.8954f, 2.89543f, 10f, 4f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 14f)
        verticalLineTo(10f)
        }
        }.build()

        return _loading04!!
    }

private var _loading04: ImageVector? = null
