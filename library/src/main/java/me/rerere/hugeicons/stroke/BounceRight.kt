package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BounceRight: ImageVector
    get() {
        if (_bounceRight != null) {
            return _bounceRight!!
        }
        _bounceRight = ImageVector.Builder(
            name = "BounceRight",
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
        moveTo(15f, 10f)
        curveTo(12.8847f, 13.01f, 11.8945f, 17.1528f, 11.248f, 20.086f)
        curveTo(11.1165f, 20.6824f, 11.0508f, 20.9806f, 10.9128f, 20.9991f)
        curveTo(10.7748f, 21.0177f, 10.6338f, 20.7339f, 10.3518f, 20.1662f)
        curveTo(9.00614f, 17.4579f, 6.21729f, 15.062f, 4f, 17.1079f)
        }
        }.build()

        return _bounceRight!!
    }

private var _bounceRight: ImageVector? = null
