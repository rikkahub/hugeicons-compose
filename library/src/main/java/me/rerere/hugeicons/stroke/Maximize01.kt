package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Maximize01: ImageVector
    get() {
        if (_maximize01 != null) {
            return _maximize01!!
        }
        _maximize01 = ImageVector.Builder(
            name = "Maximize01",
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
        moveTo(19.9264f, 22.2516f)
        verticalLineTo(20.691f)
        curveTo(19.9264f, 20.288f, 20.0525f, 19.8966f, 20.2639f, 19.5531f)
        curveTo(21.7583f, 17.1245f, 22.2279f, 14.5196f, 21.9002f, 13.505f)
        curveTo(20.857f, 11.3418f, 17.3758f, 10.4907f, 15.76f, 10.2878f)
        lineTo(16.7966f, 5.12292f)
        curveTo(16.9705f, 4.30387f, 16.3513f, 3.47938f, 15.4135f, 3.28136f)
        curveTo(14.4758f, 3.08334f, 13.5746f, 3.58679f, 13.4007f, 4.40583f)
        lineTo(11.3462f, 14.0815f)
        lineTo(8.77462f, 12.4424f)
        curveTo(8.77462f, 12.4424f, 7.47969f, 11.406f, 6.44041f, 12.4424f)
        curveTo(5.40114f, 13.4788f, 6.44041f, 14.7701f, 6.44041f, 14.7701f)
        lineTo(10.3488f, 19.7776f)
        curveTo(10.6003f, 20.0997f, 10.7468f, 20.4908f, 10.7688f, 20.8984f)
        lineTo(10.8401f, 22.2177f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.867f, 4.36134f)
        curveTo(9.867f, 4.36134f, 10.1124f, 2.14335f, 9.867f, 1.90156f)
        moveTo(9.867f, 1.90156f)
        curveTo(9.54861f, 1.58797f, 7.32936f, 1.85194f, 7.32936f, 1.85194f)
        moveTo(9.867f, 1.90156f)
        lineTo(6.89808f, 4.84002f)
        moveTo(2.11005f, 7.08754f)
        curveTo(2.11005f, 7.08754f, 1.86463f, 9.30553f, 2.11005f, 9.54732f)
        moveTo(2.11005f, 9.54732f)
        curveTo(2.42845f, 9.86092f, 4.6477f, 9.59694f, 4.6477f, 9.59694f)
        moveTo(2.11005f, 9.54732f)
        lineTo(5.07898f, 6.60886f)
        }
        }.build()

        return _maximize01!!
    }

private var _maximize01: ImageVector? = null
