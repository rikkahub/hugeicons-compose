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

val HugeIcons.AlbumNotFound01: ImageVector
    get() {
        if (_albumNotFound01 != null) {
            return _albumNotFound01!!
        }
        _albumNotFound01 = ImageVector.Builder(
            name = "AlbumNotFound01",
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
            moveTo(11f, 7f)
            curveTo(13.8284f, 7f, 15.2426f, 7f, 16.1213f, 7.87868f)
            curveTo(17f, 8.75732f, 17f, 10.172f, 17f, 13.0004f)
            moveTo(7.00173f, 7.00173f)
            curveTo(4.8256f, 7.01379f, 3.64727f, 7.11009f, 2.87868f, 7.87868f)
            curveTo(2f, 8.75736f, 2f, 10.1716f, 2f, 13f)
            verticalLineTo(18f)
            curveTo(2f, 18.93f, 2f, 19.395f, 2.10222f, 19.7765f)
            curveTo(2.37962f, 20.8117f, 3.18827f, 21.6204f, 4.22354f, 21.8978f)
            curveTo(4.60504f, 22f, 5.07003f, 22f, 6f, 22f)
            horizontalLineTo(11f)
            curveTo(13.8284f, 22f, 15.2426f, 22f, 16.1213f, 21.1213f)
            curveTo(16.8899f, 20.3528f, 16.9862f, 19.1744f, 16.9983f, 16.9983f)
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
            moveTo(7.27405f, 3.27403f)
            curveTo(7.70486f, 2.51335f, 8.52158f, 2f, 9.4582f, 2f)
            horizontalLineTo(15.9799f)
            curveTo(18.8178f, 2f, 20.2368f, 2f, 21.1184f, 2.88162f)
            curveTo(22f, 3.76324f, 22f, 5.18218f, 22f, 8.02007f)
            verticalLineTo(14.5418f)
            curveTo(22f, 15.4784f, 21.4867f, 16.2952f, 20.726f, 16.726f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _albumNotFound01!!
    }

private var _albumNotFound01: ImageVector? = null
