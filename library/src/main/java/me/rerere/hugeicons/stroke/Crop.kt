package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = ImageVector.Builder(
            name = "Crop",
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
        moveTo(4f, 2f)
        verticalLineTo(4f)
        moveTo(22f, 20f)
        horizontalLineTo(20f)
        moveTo(16.5f, 20f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 20f, 5.75736f, 20f, 4.87868f, 19.1213f)
        curveTo(4f, 18.2426f, 4f, 16.8284f, 4f, 14f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 22f)
        lineTo(20f, 12f)
        curveTo(20f, 8.22877f, 20f, 6.34315f, 18.8284f, 5.17158f)
        curveTo(17.6569f, 4f, 15.7712f, 4f, 12f, 4f)
        lineTo(2f, 4f)
        }
        }.build()

        return _crop!!
    }

private var _crop: ImageVector? = null
