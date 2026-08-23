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

val HugeIcons.CctvCamera: ImageVector
    get() {
        if (_cctvCamera != null) {
            return _cctvCamera!!
        }
        _cctvCamera = ImageVector.Builder(
            name = "CctvCamera",
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
            moveTo(8f, 14f)
            lineTo(7.64311f, 15.7845f)
            curveTo(7.33525f, 17.3237f, 7.18133f, 18.0934f, 6.62837f, 18.5467f)
            curveTo(6.07541f, 19f, 5.29054f, 19f, 3.72078f, 19f)
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
            moveTo(2f, 17f)
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
            moveTo(16.951f, 11.5083f)
            lineTo(21.2025f, 11.5411f)
            curveTo(21.3272f, 11.542f, 21.45f, 11.5724f, 21.5611f, 11.6298f)
            curveTo(21.9565f, 11.8341f, 22.1137f, 12.3247f, 21.9123f, 12.7257f)
            lineTo(19.4857f, 17.555f)
            curveTo(19.2843f, 17.9559f, 18.8005f, 18.1153f, 18.4051f, 17.911f)
            curveTo(18.294f, 17.8536f, 18.1975f, 17.7707f, 18.1235f, 17.669f)
            lineTo(15.5984f, 14.2003f)
            moveTo(13.017f, 10.4647f)
            lineTo(12.9606f, 10.5768f)
            moveTo(15.1475f, 15.0976f)
            lineTo(17.4018f, 10.611f)
            curveTo(17.8998f, 9.61987f, 17.5112f, 8.40699f, 16.5338f, 7.90198f)
            lineTo(7.68514f, 3.32994f)
            curveTo(6.21904f, 2.57242f, 4.42496f, 3.16355f, 3.67795f, 4.65027f)
            lineTo(2.32536f, 7.34221f)
            curveTo(1.57835f, 8.82892f, 2.16128f, 10.6482f, 3.62738f, 11.4058f)
            lineTo(12.476f, 15.9778f)
            curveTo(13.4534f, 16.4828f, 14.6495f, 16.0887f, 15.1475f, 15.0976f)
            close()
            moveTo(13.0733f, 10.3525f)
            curveTo(13.1955f, 10.4156f, 13.2441f, 10.5672f, 13.1818f, 10.6911f)
            curveTo(13.1196f, 10.815f, 12.9701f, 10.8643f, 12.8479f, 10.8012f)
            curveTo(12.7257f, 10.738f, 12.6772f, 10.5864f, 12.7394f, 10.4625f)
            curveTo(12.8017f, 10.3386f, 12.9512f, 10.2894f, 13.0733f, 10.3525f)
            close()
        }
        }.build()

        return _cctvCamera!!
    }

private var _cctvCamera: ImageVector? = null
