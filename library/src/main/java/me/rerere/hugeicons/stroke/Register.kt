package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Register: ImageVector
    get() {
        if (_register != null) {
            return _register!!
        }
        _register = ImageVector.Builder(
            name = "Register",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        verticalLineTo(9f)
        curveTo(10f, 8.44772f, 10.4477f, 8f, 11f, 8f)
        horizontalLineTo(12.75f)
        curveTo(13.9926f, 8f, 15f, 9.00736f, 15f, 10.25f)
        curveTo(15f, 11.4926f, 13.9926f, 12.5f, 12.75f, 12.5f)
        horizontalLineTo(10f)
        moveTo(13f, 12.5f)
        lineTo(14.5f, 16f)
        }
        }.build()

        return _register!!
    }

private var _register: ImageVector? = null
