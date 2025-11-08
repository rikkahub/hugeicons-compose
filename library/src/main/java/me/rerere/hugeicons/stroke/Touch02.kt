package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Touch02: ImageVector
    get() {
        if (_touch02 != null) {
            return _touch02!!
        }
        _touch02 = ImageVector.Builder(
            name = "Touch02",
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
        moveTo(17.1422f, 21.998f)
        curveTo(17.0905f, 20.084f, 17.2194f, 19.8535f, 17.3561f, 19.4277f)
        curveTo(17.4929f, 19.002f, 18.4492f, 17.4665f, 18.7875f, 16.3695f)
        curveTo(19.8823f, 12.8202f, 18.862f, 12.0653f, 17.5016f, 11.0588f)
        curveTo(15.9931f, 9.94257f, 13.1478f, 9.37728f, 11.7367f, 9.49966f)
        verticalLineTo(3.7462f)
        curveTo(11.7367f, 2.78288f, 10.9558f, 2.00195f, 9.99246f, 2.00195f)
        curveTo(9.02914f, 2.00195f, 8.24821f, 2.78288f, 8.24821f, 3.7462f)
        verticalLineTo(9.96607f)
        moveTo(8.24872f, 21.9988f)
        verticalLineTo(20.9854f)
        curveTo(8.18426f, 20.041f, 7.24627f, 18.9235f, 6.0777f, 17.3166f)
        curveTo(4.87607f, 15.576f, 4.61785f, 14.6973f, 4.80689f, 13.8848f)
        curveTo(4.90426f, 13.4694f, 5.15692f, 12.7832f, 6.39745f, 11.6104f)
        lineTo(8.24821f, 9.96607f)
        moveTo(8.24821f, 14.0323f)
        verticalLineTo(9.96607f)
        }
        }.build()

        return _touch02!!
    }

private var _touch02: ImageVector? = null
