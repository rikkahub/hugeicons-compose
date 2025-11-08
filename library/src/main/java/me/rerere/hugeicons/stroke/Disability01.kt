package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Disability01: ImageVector
    get() {
        if (_disability01 != null) {
            return _disability01!!
        }
        _disability01 = ImageVector.Builder(
            name = "Disability01",
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
        moveTo(19.5f, 18f)
        horizontalLineTo(18.177f)
        curveTo(17.8491f, 18f, 17.6852f, 18f, 17.5582f, 17.914f)
        curveTo(17.4312f, 17.8281f, 17.3703f, 17.6758f, 17.2486f, 17.3714f)
        lineTo(16.7514f, 16.1286f)
        curveTo(16.6297f, 15.8242f, 16.5688f, 15.6719f, 16.4418f, 15.586f)
        curveTo(16.3148f, 15.5f, 16.1509f, 15.5f, 15.823f, 15.5f)
        horizontalLineTo(13.5f)
        curveTo(13.0286f, 15.5f, 12.7929f, 15.5f, 12.6464f, 15.3536f)
        curveTo(12.5f, 15.2071f, 12.5f, 14.9714f, 12.5f, 14.5f)
        verticalLineTo(10.5f)
        moveTo(12.5f, 8f)
        verticalLineTo(10.5f)
        moveTo(12.5f, 10.5f)
        horizontalLineTo(16.3889f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 6f)
        curveTo(11.3954f, 6f, 10.5f, 5.10457f, 10.5f, 4f)
        curveTo(10.5f, 2.89543f, 11.3954f, 2f, 12.5f, 2f)
        curveTo(13.6046f, 2f, 14.5f, 2.89543f, 14.5f, 4f)
        curveTo(14.5f, 5.10457f, 13.6046f, 6f, 12.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.55796f, 10f)
        curveTo(6.68735f, 10.4794f, 4.5f, 12.9645f, 4.5f, 15.9582f)
        curveTo(4.5f, 19.295f, 7.21743f, 22f, 10.5696f, 22f)
        curveTo(12.6003f, 22f, 14.3982f, 21.0072f, 15.5f, 19.4826f)
        }
        }.build()

        return _disability01!!
    }

private var _disability01: ImageVector? = null
