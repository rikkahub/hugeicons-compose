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

val HugeIcons.AiWatermark: ImageVector
    get() {
        if (_aiWatermark != null) {
            return _aiWatermark!!
        }
        _aiWatermark = ImageVector.Builder(
            name = "AiWatermark",
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
            moveTo(19.5f, 16.9375f)
            verticalLineTo(18.5f)
            moveTo(19.5f, 18.5f)
            verticalLineTo(20.0625f)
            moveTo(19.5f, 18.5f)
            horizontalLineTo(18.25f)
            moveTo(19.5f, 18.5f)
            horizontalLineTo(20.75f)
            moveTo(22f, 18.5f)
            lineTo(20.9156f, 18.1385f)
            curveTo(20.4179f, 17.9726f, 20.0274f, 17.5821f, 19.8615f, 17.0844f)
            lineTo(19.5f, 16f)
            lineTo(19.1385f, 17.0844f)
            curveTo(18.9726f, 17.5821f, 18.5821f, 17.9726f, 18.0844f, 18.1385f)
            lineTo(17f, 18.5f)
            lineTo(18.0844f, 18.8615f)
            curveTo(18.5821f, 19.0274f, 18.9726f, 19.4179f, 19.1385f, 19.9156f)
            lineTo(19.5f, 21f)
            lineTo(19.8615f, 19.9156f)
            curveTo(20.0274f, 19.4179f, 20.4179f, 19.0274f, 20.9156f, 18.8615f)
            lineTo(22f, 18.5f)
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
            moveTo(13.5f, 18f)
            horizontalLineTo(6f)
            curveTo(4.89543f, 18f, 4f, 17.1046f, 4f, 16f)
            verticalLineTo(15.4009f)
            curveTo(4f, 14.5598f, 4.52613f, 13.8087f, 5.31651f, 13.5213f)
            lineTo(8.91246f, 12.2136f)
            curveTo(9.27192f, 12.0829f, 9.52533f, 11.7586f, 9.56526f, 11.3782f)
            lineTo(9.89326f, 8.25314f)
            curveTo(9.96029f, 7.61444f, 9.67559f, 7.00237f, 9.36707f, 6.43912f)
            curveTo(9.13306f, 6.01189f, 9f, 5.52148f, 9f, 5f)
            curveTo(9f, 3.34315f, 10.3431f, 2f, 12f, 2f)
            curveTo(13.6569f, 2f, 15f, 3.34315f, 15f, 5f)
            curveTo(15f, 5.52148f, 14.8669f, 6.01189f, 14.6329f, 6.43912f)
            curveTo(14.3244f, 7.00237f, 14.0397f, 7.61444f, 14.1067f, 8.25314f)
            lineTo(14.4347f, 11.3782f)
            curveTo(14.4747f, 11.7586f, 14.7281f, 12.0829f, 15.0875f, 12.2136f)
            lineTo(18f, 13.2727f)
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
            moveTo(4f, 21f)
            horizontalLineTo(13.5f)
        }
        }.build()

        return _aiWatermark!!
    }

private var _aiWatermark: ImageVector? = null
