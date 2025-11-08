package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.License: ImageVector
    get() {
        if (_license != null) {
            return _license!!
        }
        _license = ImageVector.Builder(
            name = "License",
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
        moveTo(20.4999f, 14f)
        verticalLineTo(10f)
        curveTo(20.4999f, 6.22876f, 20.4999f, 4.34315f, 19.3284f, 3.17157f)
        curveTo(18.1568f, 2f, 16.2712f, 2f, 12.4999f, 2f)
        horizontalLineTo(11.5f)
        curveTo(7.72883f, 2f, 5.84323f, 2f, 4.67166f, 3.17156f)
        curveTo(3.50008f, 4.34312f, 3.50007f, 6.22872f, 3.50004f, 9.99993f)
        lineTo(3.5f, 13.9999f)
        curveTo(3.49997f, 17.7712f, 3.49995f, 19.6568f, 4.67153f, 20.8284f)
        curveTo(5.8431f, 22f, 7.72873f, 22f, 11.5f, 22f)
        horizontalLineTo(12.4999f)
        curveTo(16.2712f, 22f, 18.1568f, 22f, 19.3284f, 20.8284f)
        curveTo(20.4999f, 19.6569f, 20.4999f, 17.7712f, 20.4999f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        horizontalLineTo(16f)
        moveTo(8f, 12f)
        horizontalLineTo(16f)
        moveTo(8f, 17f)
        lineTo(12f, 17f)
        }
        }.build()

        return _license!!
    }

private var _license: ImageVector? = null
