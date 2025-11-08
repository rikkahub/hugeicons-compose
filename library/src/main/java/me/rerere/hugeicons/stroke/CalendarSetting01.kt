package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarSetting01: ImageVector
    get() {
        if (_calendarSetting01 != null) {
            return _calendarSetting01!!
        }
        _calendarSetting01 = ImageVector.Builder(
            name = "CalendarSetting01",
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
        moveTo(16f, 2f)
        verticalLineTo(6f)
        moveTo(8f, 2f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12.5f)
        verticalLineTo(12f)
        curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
        curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
        curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 10f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 20.5f)
        curveTo(18.4293f, 20.5f, 19.2402f, 19.993f, 19.671f, 19.2404f)
        moveTo(17.5f, 20.5f)
        curveTo(16.5707f, 20.5f, 15.7598f, 19.993f, 15.329f, 19.2404f)
        moveTo(17.5f, 20.5f)
        lineTo(17.5f, 22f)
        moveTo(17.5f, 15.5f)
        curveTo(18.4292f, 15.5f, 19.24f, 16.0069f, 19.6709f, 16.7593f)
        moveTo(17.5f, 15.5f)
        curveTo(16.5708f, 15.5f, 15.76f, 16.0069f, 15.3291f, 16.7593f)
        moveTo(17.5f, 15.5f)
        lineTo(17.5f, 14f)
        moveTo(21f, 15.9998f)
        lineTo(19.6709f, 16.7593f)
        moveTo(14f, 19.9998f)
        lineTo(15.329f, 19.2404f)
        moveTo(21f, 19.9998f)
        lineTo(19.671f, 19.2404f)
        moveTo(14f, 15.9998f)
        lineTo(15.3291f, 16.7593f)
        moveTo(19.6709f, 16.7593f)
        curveTo(19.8803f, 17.1249f, 20f, 17.5485f, 20f, 18f)
        curveTo(20f, 18.4514f, 19.8804f, 18.8749f, 19.671f, 19.2404f)
        moveTo(15.329f, 19.2404f)
        curveTo(15.1196f, 18.8749f, 15f, 18.4514f, 15f, 18f)
        curveTo(15f, 17.5485f, 15.1197f, 17.1249f, 15.3291f, 16.7593f)
        }
        }.build()

        return _calendarSetting01!!
    }

private var _calendarSetting01: ImageVector? = null
