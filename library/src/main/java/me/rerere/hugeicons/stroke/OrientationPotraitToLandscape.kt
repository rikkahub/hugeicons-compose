package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OrientationPotraitToLandscape: ImageVector
    get() {
        if (_orientationPotraitToLandscape != null) {
            return _orientationPotraitToLandscape!!
        }
        _orientationPotraitToLandscape = ImageVector.Builder(
            name = "OrientationPotraitToLandscape",
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
        moveTo(12f, 17f)
        verticalLineTo(9f)
        curveTo(12f, 6.64298f, 12f, 5.46447f, 11.2678f, 4.73223f)
        curveTo(10.5355f, 4f, 9.35702f, 4f, 7f, 4f)
        curveTo(4.64298f, 4f, 3.46447f, 4f, 2.73223f, 4.73223f)
        curveTo(2f, 5.46447f, 2f, 6.64298f, 2f, 9f)
        verticalLineTo(17f)
        curveTo(2f, 19.357f, 2f, 20.5355f, 2.73223f, 21.2678f)
        curveTo(3.46447f, 22f, 4.64298f, 22f, 7f, 22f)
        curveTo(9.35702f, 22f, 10.5355f, 22f, 11.2678f, 21.2678f)
        curveTo(12f, 20.5355f, 12f, 19.357f, 12f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 22f)
        curveTo(17.357f, 22f, 18.5355f, 22f, 19.2678f, 21.2678f)
        curveTo(20f, 20.5355f, 20f, 19.357f, 20f, 17f)
        curveTo(20f, 14.643f, 20f, 13.4645f, 19.2678f, 12.7322f)
        curveTo(18.5355f, 12f, 17.357f, 12f, 15f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 5.5f)
        lineTo(19.5f, 8f)
        lineTo(17f, 5.5f)
        moveTo(19.5f, 7f)
        curveTo(19.5f, 4.64298f, 19.5f, 3.46447f, 18.7678f, 2.73223f)
        curveTo(18.0355f, 2f, 16.857f, 2f, 14.5f, 2f)
        }
        }.build()

        return _orientationPotraitToLandscape!!
    }

private var _orientationPotraitToLandscape: ImageVector? = null
