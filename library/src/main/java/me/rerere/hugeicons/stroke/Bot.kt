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

val HugeIcons.Bot: ImageVector
    get() {
        if (_bot != null) {
            return _bot!!
        }
        _bot = ImageVector.Builder(
            name = "Bot",
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
            moveTo(13f, 7f)
            horizontalLineTo(11f)
            curveTo(8.19108f, 7f, 6.78661f, 7f, 5.77772f, 7.67412f)
            curveTo(5.34096f, 7.96596f, 4.96596f, 8.34096f, 4.67412f, 8.77772f)
            curveTo(4f, 9.78661f, 4f, 11.1911f, 4f, 14f)
            curveTo(4f, 16.8089f, 4f, 18.2134f, 4.67412f, 19.2223f)
            curveTo(4.96596f, 19.659f, 5.34096f, 20.034f, 5.77772f, 20.3259f)
            curveTo(6.78661f, 21f, 8.19108f, 21f, 11f, 21f)
            horizontalLineTo(13f)
            curveTo(15.8089f, 21f, 17.2134f, 21f, 18.2223f, 20.3259f)
            curveTo(18.659f, 20.034f, 19.034f, 19.659f, 19.3259f, 19.2223f)
            curveTo(20f, 18.2134f, 20f, 16.8089f, 20f, 14f)
            curveTo(20f, 11.1911f, 20f, 9.78661f, 19.3259f, 8.77772f)
            curveTo(19.034f, 8.34096f, 18.659f, 7.96596f, 18.2223f, 7.67412f)
            curveTo(17.2134f, 7f, 15.8089f, 7f, 13f, 7f)
            close()
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
            moveTo(4f, 14f)
            horizontalLineTo(2f)
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
            moveTo(10f, 17f)
            horizontalLineTo(14f)
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
            moveTo(22f, 14f)
            horizontalLineTo(20f)
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
            moveTo(15f, 11f)
            verticalLineTo(13f)
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
            moveTo(9f, 11f)
            verticalLineTo(13f)
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
            curveTo(12f, 5.11438f, 12f, 4.17157f, 11.4142f, 3.58579f)
            curveTo(10.8284f, 3f, 9.88562f, 3f, 8f, 3f)
        }
        }.build()

        return _bot!!
    }

private var _bot: ImageVector? = null
