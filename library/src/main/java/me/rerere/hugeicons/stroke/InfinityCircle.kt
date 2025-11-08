package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InfinityCircle: ImageVector
    get() {
        if (_infinityCircle != null) {
            return _infinityCircle!!
        }
        _infinityCircle = ImageVector.Builder(
            name = "InfinityCircle",
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
        moveTo(12f, 12f)
        curveTo(12f, 12f, 10.3569f, 14.5f, 8.7f, 14.5f)
        curveTo(7.04315f, 14.5f, 6f, 13.3807f, 6f, 12f)
        curveTo(6f, 10.6193f, 7.04315f, 9.5f, 8.7f, 9.5f)
        curveTo(10.3569f, 9.5f, 12f, 12f, 12f, 12f)
        moveTo(12f, 12f)
        curveTo(12f, 12f, 13.6431f, 14.5f, 15.3f, 14.5f)
        curveTo(16.9569f, 14.5f, 18f, 13.3807f, 18f, 12f)
        curveTo(18f, 10.6193f, 16.9569f, 9.5f, 15.3f, 9.5f)
        curveTo(13.6431f, 9.5f, 12f, 12f, 12f, 12f)
        }
        }.build()

        return _infinityCircle!!
    }

private var _infinityCircle: ImageVector? = null
