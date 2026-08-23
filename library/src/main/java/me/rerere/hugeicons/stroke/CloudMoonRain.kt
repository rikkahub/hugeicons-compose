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

val HugeIcons.CloudMoonRain: ImageVector
    get() {
        if (_cloudMoonRain != null) {
            return _cloudMoonRain!!
        }
        _cloudMoonRain = ImageVector.Builder(
            name = "CloudMoonRain",
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
            moveTo(11f, 19f)
            verticalLineTo(21f)
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
            moveTo(19.0394f, 13f)
            curveTo(19.7703f, 12.674f, 20.4173f, 12.1759f, 20.9289f, 11.5455f)
            curveTo(21.4404f, 10.9151f, 21.8023f, 10.1698f, 21.9856f, 9.36918f)
            curveTo(22.1116f, 8.81932f, 21.4246f, 8.5158f, 20.9232f, 8.74102f)
            curveTo(20.2968f, 9.02108f, 19.6034f, 9.1001f, 18.933f, 8.96783f)
            curveTo(18.2625f, 8.83557f, 17.646f, 8.49813f, 17.1635f, 7.99929f)
            curveTo(16.6809f, 7.50046f, 16.3545f, 6.86324f, 16.2267f, 6.17033f)
            curveTo(16.0988f, 5.47742f, 16.1754f, 4.76079f, 16.4465f, 4.11343f)
            curveTo(16.6636f, 3.59524f, 16.3699f, 2.88614f, 15.837f, 3.01547f)
            curveTo(14.7866f, 3.27341f, 13.8423f, 3.86874f, 13.1397f, 4.71597f)
            curveTo(12.8171f, 5.10495f, 12.5531f, 5.53786f, 12.3535f, 6f)
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
            moveTo(14f, 18.7938f)
            curveTo(15.1709f, 18.3563f, 16f, 17.2703f, 16f, 16f)
            curveTo(16f, 14.3431f, 14.5897f, 13f, 12.85f, 13f)
            curveTo(12.8448f, 13f, 12.8395f, 13f, 12.8343f, 13f)
            curveTo(12.8447f, 12.8902f, 12.85f, 12.779f, 12.85f, 12.6667f)
            curveTo(12.85f, 10.6416f, 11.1263f, 9f, 9f, 9f)
            curveTo(6.98627f, 9f, 5.33363f, 10.4724f, 5.1643f, 12.3485f)
            curveTo(3.38879f, 12.5094f, 2f, 13.9336f, 2f, 15.6667f)
            curveTo(2f, 16.9964f, 2.81753f, 18.1442f, 4f, 18.6792f)
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
            moveTo(7f, 18f)
            verticalLineTo(20f)
        }
        }.build()

        return _cloudMoonRain!!
    }

private var _cloudMoonRain: ImageVector? = null
