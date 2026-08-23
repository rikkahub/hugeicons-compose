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

val HugeIcons.BulbCharging: ImageVector
    get() {
        if (_bulbCharging != null) {
            return _bulbCharging!!
        }
        _bulbCharging = ImageVector.Builder(
            name = "BulbCharging",
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
            moveTo(17.2916f, 16f)
            curveTo(18.9525f, 14.5341f, 20f, 12.3894f, 20f, 10f)
            curveTo(20f, 5.58173f, 16.4182f, 2f, 12f, 2f)
            curveTo(7.58173f, 2f, 4f, 5.58173f, 4f, 10f)
            curveTo(4f, 12.3894f, 5.04751f, 14.5341f, 6.70836f, 16f)
        }

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
            moveTo(12f, 7f)
            lineTo(10.8181f, 8.35982f)
            curveTo(10.2013f, 9.06938f, 9.89295f, 9.42416f, 10.0336f, 9.71208f)
            curveTo(10.1743f, 10f, 10.656f, 10f, 11.6193f, 10f)
            horizontalLineTo(12.3807f)
            curveTo(13.344f, 10f, 13.8257f, 10f, 13.9664f, 10.2879f)
            curveTo(14.1071f, 10.5758f, 13.7987f, 10.9306f, 13.1819f, 11.6402f)
            lineTo(12f, 13f)
        }

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
            moveTo(8.5f, 19f)
            horizontalLineTo(15.5f)
        }

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
            moveTo(10f, 22f)
            horizontalLineTo(14f)
        }
        }.build()

        return _bulbCharging!!
    }

private var _bulbCharging: ImageVector? = null
