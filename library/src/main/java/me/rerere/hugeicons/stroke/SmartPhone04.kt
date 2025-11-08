package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SmartPhone04: ImageVector
    get() {
        if (_smartPhone04 != null) {
            return _smartPhone04!!
        }
        _smartPhone04 = ImageVector.Builder(
            name = "SmartPhone04",
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
        moveTo(19.0483f, 16.4922f)
        curveTo(20.2541f, 15.3405f, 21f, 13.7495f, 21f, 11.9922f)
        curveTo(21f, 10.2348f, 20.2541f, 8.64384f, 19.0483f, 7.49219f)
        moveTo(17f, 9.74219f)
        curveTo(17.6029f, 10.318f, 17.9759f, 11.1135f, 17.9759f, 11.9922f)
        curveTo(17.9759f, 12.8709f, 17.6029f, 13.6664f, 17f, 14.2422f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7f)
        curveTo(16f, 4.64298f, 16f, 3.46447f, 15.2678f, 2.73223f)
        curveTo(14.5355f, 2f, 13.357f, 2f, 11f, 2f)
        horizontalLineTo(8f)
        curveTo(5.64298f, 2f, 4.46447f, 2f, 3.73223f, 2.73223f)
        curveTo(3f, 3.46447f, 3f, 4.64298f, 3f, 7f)
        verticalLineTo(17f)
        curveTo(3f, 19.357f, 3f, 20.5355f, 3.73223f, 21.2678f)
        curveTo(4.46447f, 22f, 5.64298f, 22f, 8f, 22f)
        horizontalLineTo(11f)
        curveTo(13.357f, 22f, 14.5355f, 22f, 15.2678f, 21.2678f)
        curveTo(16f, 20.5355f, 16f, 19.357f, 16f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 2f)
        horizontalLineTo(7.5f)
        lineTo(8f, 3f)
        horizontalLineTo(11f)
        lineTo(11.5f, 2f)
        }
        }.build()

        return _smartPhone04!!
    }

private var _smartPhone04: ImageVector? = null
