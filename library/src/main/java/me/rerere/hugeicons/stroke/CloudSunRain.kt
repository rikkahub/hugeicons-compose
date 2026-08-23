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

val HugeIcons.CloudSunRain: ImageVector
    get() {
        if (_cloudSunRain != null) {
            return _cloudSunRain!!
        }
        _cloudSunRain = ImageVector.Builder(
            name = "CloudSunRain",
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
            moveTo(14f, 20.7938f)
            curveTo(15.1709f, 20.3563f, 16f, 19.2703f, 16f, 18f)
            curveTo(16f, 16.3431f, 14.5897f, 15f, 12.85f, 15f)
            curveTo(12.8448f, 15f, 12.8395f, 15f, 12.8343f, 15f)
            curveTo(12.8447f, 14.8902f, 12.85f, 14.779f, 12.85f, 14.6667f)
            curveTo(12.85f, 12.6416f, 11.1263f, 11f, 9f, 11f)
            curveTo(6.98627f, 11f, 5.33363f, 12.4724f, 5.1643f, 14.3485f)
            curveTo(3.38879f, 14.5094f, 2f, 15.9336f, 2f, 17.6667f)
            curveTo(2f, 18.9964f, 2.81753f, 20.1442f, 4f, 20.6792f)
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
            moveTo(17.3686f, 13f)
            curveTo(17.4509f, 12.6804f, 17.4946f, 12.3453f, 17.4946f, 12f)
            curveTo(17.4946f, 9.79086f, 15.7038f, 8f, 13.4946f, 8f)
            curveTo(12.7915f, 8f, 12.1308f, 8.18142f, 11.5566f, 8.5f)
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
            moveTo(13.494f, 3f)
            verticalLineTo(4f)
            moveTo(21.999f, 11.495f)
            horizontalLineTo(20.999f)
            moveTo(19.5059f, 5.48617f)
            lineTo(18.7988f, 6.19328f)
            moveTo(8.19929f, 6.19343f)
            lineTo(7.49218f, 5.48633f)
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
            moveTo(7f, 18f)
            verticalLineTo(20f)
        }
        }.build()

        return _cloudSunRain!!
    }

private var _cloudSunRain: ImageVector? = null
