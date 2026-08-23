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

val HugeIcons.ArrowUpLeft01: ImageVector
    get() {
        if (_arrowUpLeft01 != null) {
            return _arrowUpLeft01!!
        }
        _arrowUpLeft01 = ImageVector.Builder(
            name = "ArrowUpLeft01",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 6.65032f)
            curveTo(15f, 6.65032f, 8.06166f, 6.10759f, 7.08461f, 7.08463f)
            curveTo(6.10755f, 8.06167f, 6.65037f, 15f, 6.65037f, 15f)
            moveTo(7.5f, 7.5f)
            lineTo(17.5f, 17.5f)
        }
        }.build()

        return _arrowUpLeft01!!
    }

private var _arrowUpLeft01: ImageVector? = null
