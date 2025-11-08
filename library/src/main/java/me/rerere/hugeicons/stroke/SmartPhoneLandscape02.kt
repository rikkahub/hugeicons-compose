package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SmartPhoneLandscape02: ImageVector
    get() {
        if (_smartPhoneLandscape02 != null) {
            return _smartPhoneLandscape02!!
        }
        _smartPhoneLandscape02 = ImageVector.Builder(
            name = "SmartPhoneLandscape02",
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
        moveTo(2.00015f, 10.5f)
        lineTo(2.00015f, 13.5f)
        curveTo(2.00015f, 15.857f, 2.00015f, 17.0355f, 2.73239f, 17.7678f)
        curveTo(3.46462f, 18.5f, 4.64313f, 18.5f, 7.00015f, 18.5f)
        horizontalLineTo(17.0002f)
        curveTo(19.3572f, 18.5f, 20.5357f, 18.5f, 21.2679f, 17.7678f)
        curveTo(22.0002f, 17.0355f, 22.0002f, 15.857f, 22.0002f, 13.5f)
        verticalLineTo(10.5f)
        curveTo(22.0002f, 8.14298f, 22.0002f, 6.96447f, 21.2679f, 6.23223f)
        curveTo(20.5357f, 5.5f, 19.3572f, 5.5f, 17.0002f, 5.5f)
        lineTo(7.00015f, 5.5f)
        curveTo(4.64313f, 5.5f, 3.46462f, 5.5f, 2.73239f, 6.23223f)
        curveTo(2.00015f, 6.96447f, 2.00015f, 8.14298f, 2.00015f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(1.99991f, 9.5f)
        lineTo(1.99991f, 13.5f)
        lineTo(2.99991f, 13f)
        lineTo(2.99991f, 10f)
        lineTo(1.99991f, 9.5f)
        }
        }.build()

        return _smartPhoneLandscape02!!
    }

private var _smartPhoneLandscape02: ImageVector? = null
