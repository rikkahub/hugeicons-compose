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

val HugeIcons.Album01: ImageVector
    get() {
        if (_album01 != null) {
            return _album01!!
        }
        _album01 = ImageVector.Builder(
            name = "Album01",
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
            moveTo(2f, 13f)
            curveTo(2f, 10.1716f, 2f, 8.75736f, 2.87868f, 7.87868f)
            curveTo(3.75736f, 7f, 5.17157f, 7f, 8f, 7f)
            horizontalLineTo(11f)
            curveTo(13.8284f, 7f, 15.2426f, 7f, 16.1213f, 7.87868f)
            curveTo(17f, 8.75736f, 17f, 10.1717f, 17f, 13.0004f)
            curveTo(17f, 14.009f, 17f, 14.991f, 17f, 15.9996f)
            curveTo(17f, 18.8283f, 17f, 20.2426f, 16.1213f, 21.1213f)
            curveTo(15.2426f, 22f, 13.8284f, 22f, 11f, 22f)
            horizontalLineTo(6f)
            curveTo(5.07003f, 22f, 4.60504f, 22f, 4.22354f, 21.8978f)
            curveTo(3.18827f, 21.6204f, 2.37962f, 20.8117f, 2.10222f, 19.7765f)
            curveTo(2f, 19.395f, 2f, 18.93f, 2f, 18f)
            verticalLineTo(13f)
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
            moveTo(15.5f, 21.5f)
            lineTo(9.2658f, 14.5858f)
            curveTo(8.5452f, 13.8652f, 7.398f, 13.8016f, 6.6022f, 14.4383f)
            lineTo(2f, 17.5f)
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
            moveTo(12.5f, 11.25f)
            verticalLineTo(11.75f)
            moveTo(12.25f, 11.5f)
            horizontalLineTo(12.75f)
            moveTo(13f, 11.5f)
            curveTo(13f, 11.7761f, 12.7761f, 12f, 12.5f, 12f)
            curveTo(12.2239f, 12f, 12f, 11.7761f, 12f, 11.5f)
            curveTo(12f, 11.2239f, 12.2239f, 11f, 12.5f, 11f)
            curveTo(12.7761f, 11f, 13f, 11.2239f, 13f, 11.5f)
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
            moveTo(19.9933f, 17f)
            curveTo(21.1382f, 16.7676f, 22f, 15.7553f, 22f, 14.5418f)
            verticalLineTo(8.02007f)
            curveTo(22f, 5.18218f, 22f, 3.76324f, 21.1184f, 2.88162f)
            curveTo(20.2368f, 2f, 18.8178f, 2f, 15.9799f, 2f)
            horizontalLineTo(9.45819f)
            curveTo(8.24466f, 2f, 7.23241f, 2.86175f, 7f, 4.00669f)
        }
        }.build()

        return _album01!!
    }

private var _album01: ImageVector? = null
