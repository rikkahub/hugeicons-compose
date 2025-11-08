package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SmartPhoneLandscape: ImageVector
    get() {
        if (_smartPhoneLandscape != null) {
            return _smartPhoneLandscape!!
        }
        _smartPhoneLandscape = ImageVector.Builder(
            name = "SmartPhoneLandscape",
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
        moveTo(19f, 12.0039f)
        horizontalLineTo(19.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10.5f)
        lineTo(2f, 13.5f)
        curveTo(2f, 15.857f, 2f, 17.0355f, 2.73223f, 17.7678f)
        curveTo(3.46447f, 18.5f, 4.64298f, 18.5f, 7f, 18.5f)
        horizontalLineTo(17f)
        curveTo(19.357f, 18.5f, 20.5355f, 18.5f, 21.2678f, 17.7678f)
        curveTo(22f, 17.0355f, 22f, 15.857f, 22f, 13.5f)
        verticalLineTo(10.5f)
        curveTo(22f, 8.14298f, 22f, 6.96447f, 21.2678f, 6.23223f)
        curveTo(20.5355f, 5.5f, 19.357f, 5.5f, 17f, 5.5f)
        lineTo(7f, 5.5f)
        curveTo(4.64298f, 5.5f, 3.46447f, 5.5f, 2.73223f, 6.23223f)
        curveTo(2f, 6.96447f, 2f, 8.14298f, 2f, 10.5f)
        }
        }.build()

        return _smartPhoneLandscape!!
    }

private var _smartPhoneLandscape: ImageVector? = null
