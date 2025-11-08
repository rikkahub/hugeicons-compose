package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AppleVisionPro: ImageVector
    get() {
        if (_appleVisionPro != null) {
            return _appleVisionPro!!
        }
        _appleVisionPro = ImageVector.Builder(
            name = "AppleVisionPro",
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
        moveTo(6.5f, 17.5f)
        curveTo(4f, 17.5f, 1.99974f, 16f, 2f, 12.5f)
        curveTo(2.00029f, 8.5f, 5.00001f, 6.5f, 12f, 6.5f)
        curveTo(19f, 6.5f, 21.9997f, 8.5f, 22f, 12.5f)
        curveTo(22.0003f, 16f, 20f, 17.5f, 17.5f, 17.5f)
        curveTo(15f, 17.5f, 13.5f, 15f, 12f, 15f)
        curveTo(10.5f, 15f, 9f, 17.5f, 6.5f, 17.5f)
        }
        }.build()

        return _appleVisionPro!!
    }

private var _appleVisionPro: ImageVector? = null
