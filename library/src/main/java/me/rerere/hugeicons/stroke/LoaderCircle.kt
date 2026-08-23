package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LoaderCircle: ImageVector
    get() {
        if (_loaderCircle != null) {
            return _loaderCircle!!
        }
        _loaderCircle = ImageVector.Builder(
            name = "LoaderCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.9961f, 12f)
            curveTo(21.9961f, 17.5228f, 17.5189f, 22f, 11.9961f, 22f)
            curveTo(6.47325f, 22f, 1.99609f, 17.5228f, 1.99609f, 12f)
            curveTo(1.99609f, 6.47715f, 6.47325f, 2f, 11.9961f, 2f)
        }
        }.build()

        return _loaderCircle!!
    }

private var _loaderCircle: ImageVector? = null
