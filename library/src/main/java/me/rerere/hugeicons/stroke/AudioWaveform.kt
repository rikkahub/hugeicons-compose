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

val HugeIcons.AudioWaveform: ImageVector
    get() {
        if (_audioWaveform != null) {
            return _audioWaveform!!
        }
        _audioWaveform = ImageVector.Builder(
            name = "AudioWaveform",
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
            moveTo(22f, 14f)
            horizontalLineTo(21.7276f)
            curveTo(21.348f, 14f, 21.1582f, 14f, 20.9963f, 13.9637f)
            curveTo(20.495f, 13.8514f, 20.086f, 13.4904f, 19.9124f, 13.0069f)
            curveTo(19.8563f, 12.8507f, 19.8328f, 12.6624f, 19.7857f, 12.2857f)
            lineTo(19.6225f, 10.98f)
            curveTo(19.5525f, 10.4201f, 19.0766f, 10f, 18.5124f, 10f)
            curveTo(17.9377f, 10f, 17.4564f, 10.4355f, 17.3993f, 11.0074f)
            lineTo(16.5992f, 19.0081f)
            curveTo(16.5429f, 19.5712f, 16.069f, 20f, 15.5031f, 20f)
            curveTo(14.9346f, 20f, 14.4594f, 19.5673f, 14.4064f, 19.0013f)
            lineTo(13.0933f, 4.99563f)
            curveTo(13.0404f, 4.43134f, 12.5668f, 4f, 12f, 4f)
            curveTo(11.4332f, 4f, 10.9596f, 4.43134f, 10.9067f, 4.99564f)
            lineTo(9.59363f, 19.0013f)
            curveTo(9.54056f, 19.5673f, 9.06543f, 20f, 8.49689f, 20f)
            curveTo(7.93097f, 20f, 7.45712f, 19.5712f, 7.40081f, 19.0081f)
            lineTo(6.60074f, 11.0074f)
            curveTo(6.54355f, 10.4355f, 6.06232f, 10f, 5.48758f, 10f)
            curveTo(4.92339f, 10f, 4.44749f, 10.4201f, 4.37751f, 10.98f)
            lineTo(4.21429f, 12.2857f)
            curveTo(4.1672f, 12.6624f, 4.14366f, 12.8507f, 4.08759f, 13.0069f)
            curveTo(3.91398f, 13.4904f, 3.50501f, 13.8514f, 3.00369f, 13.9637f)
            curveTo(2.84176f, 14f, 2.65197f, 14f, 2.27237f, 14f)
            horizontalLineTo(2f)
        }
        }.build()

        return _audioWaveform!!
    }

private var _audioWaveform: ImageVector? = null
