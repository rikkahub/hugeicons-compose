package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Camel: ImageVector
    get() {
        if (_camel != null) {
            return _camel!!
        }
        _camel = ImageVector.Builder(
            name = "Camel",
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
        moveTo(12f, 13.7208f)
        curveTo(11.31f, 13.3101f, 11f, 12.8256f, 11f, 12.5f)
        moveTo(12f, 13.7208f)
        verticalLineTo(20f)
        horizontalLineTo(8.5f)
        lineTo(10f, 18f)
        lineTo(9f, 13.5f)
        curveTo(6f, 13.5f, 4.5f, 10f, 4.5f, 8f)
        horizontalLineTo(3f)
        curveTo(2.44772f, 8f, 2f, 7.55228f, 2f, 7f)
        curveTo(2f, 5.89543f, 2.89543f, 5f, 4f, 5f)
        horizontalLineTo(5.5f)
        lineTo(5.76816f, 4.59775f)
        curveTo(6.16561f, 4.00159f, 6.98227f, 3.8617f, 7.55547f, 4.2916f)
        curveTo(8.08539f, 4.68904f, 8.21252f, 5.43122f, 7.84509f, 5.98237f)
        lineTo(7.5f, 6.5f)
        curveTo(7.33333f, 7.16667f, 7.3f, 8.6f, 8.5f, 9f)
        curveTo(9.16667f, 9.16667f, 10.6f, 9f, 11f, 7f)
        curveTo(11.5f, 5.5f, 12.5f, 3f, 14.5f, 3f)
        curveTo(16.1156f, 3f, 16.4261f, 5.28398f, 18.3308f, 6.9526f)
        curveTo(19.2335f, 7.7434f, 20f, 8.7781f, 20f, 9.97819f)
        verticalLineTo(20f)
        horizontalLineTo(17f)
        lineTo(18f, 18f)
        lineTo(17.5f, 14.2285f)
        curveTo(15.7934f, 14.7554f, 13.5427f, 14.6389f, 12f, 13.7208f)
        moveTo(19.2986f, 8f)
        curveTo(19.2986f, 8f, 22f, 8.50003f, 22f, 12f)
        }
        }.build()

        return _camel!!
    }

private var _camel: ImageVector? = null
