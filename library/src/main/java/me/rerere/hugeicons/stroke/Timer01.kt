package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Timer01: ImageVector
    get() {
        if (_timer01 != null) {
            return _timer01!!
        }
        _timer01 = ImageVector.Builder(
            name = "Timer01",
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
        moveTo(11.0809f, 13.152f)
        lineTo(8f, 7f)
        lineTo(13.4196f, 11.2796f)
        curveTo(14.1901f, 11.888f, 14.1941f, 13.0472f, 13.4277f, 13.6607f)
        curveTo(12.6614f, 14.2743f, 11.5189f, 14.0266f, 11.0809f, 13.152f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 4.82f)
        curveTo(3.14864f, 6.63902f, 2f, 9.17385f, 2f, 11.9776f)
        curveTo(2f, 17.5129f, 6.47715f, 22.0001f, 12f, 22.0001f)
        curveTo(17.5228f, 22.0001f, 22f, 17.5129f, 22f, 11.9776f)
        curveTo(22f, 7.1242f, 18.5581f, 3.07656f, 13.9872f, 2.15288f)
        curveTo(13.1512f, 1.98394f, 12.7332f, 1.89947f, 12.3666f, 2.20022f)
        curveTo(12f, 2.50097f, 12f, 2.98714f, 12f, 3.95949f)
        verticalLineTo(4.96175f)
        }
        }.build()

        return _timer01!!
    }

private var _timer01: ImageVector? = null
