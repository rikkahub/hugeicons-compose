package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MedicalMask: ImageVector
    get() {
        if (_medicalMask != null) {
            return _medicalMask!!
        }
        _medicalMask = ImageVector.Builder(
            name = "MedicalMask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8.5f)
        horizontalLineTo(8.70711f)
        curveTo(8.25435f, 8.5f, 7.82014f, 8.67986f, 7.5f, 9f)
        moveTo(14f, 8.5f)
        horizontalLineTo(15.2929f)
        curveTo(15.7456f, 8.5f, 16.1799f, 8.67986f, 16.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.31313f, 17.9198f)
        curveTo(6.89597f, 16.5535f, 6.89576f, 14.4497f, 7.31168f, 13.0825f)
        curveTo(7.57009f, 12.2331f, 8.29788f, 12f, 9.11765f, 12f)
        horizontalLineTo(14.8823f)
        curveTo(15.701f, 12f, 16.4284f, 12.2327f, 16.6872f, 13.0807f)
        curveTo(17.1043f, 14.4476f, 17.1043f, 16.5524f, 16.6872f, 17.9193f)
        curveTo(16.4284f, 18.7673f, 15.701f, 19f, 14.8823f, 19f)
        horizontalLineTo(9.11765f)
        curveTo(8.29936f, 19f, 7.57194f, 18.7675f, 7.31313f, 17.9198f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 13.5f)
        lineTo(2f, 12f)
        moveTo(17f, 13.5f)
        lineTo(22f, 12f)
        moveTo(7f, 17.5f)
        lineTo(3.5f, 17f)
        moveTo(17f, 17.5f)
        lineTo(20.5f, 17f)
        }
        }.build()

        return _medicalMask!!
    }

private var _medicalMask: ImageVector? = null
