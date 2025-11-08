package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Login02: ImageVector
    get() {
        if (_login02 != null) {
            return _login02!!
        }
        _login02 = ImageVector.Builder(
            name = "Login02",
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
        moveTo(20.6073f, 4.00087f)
        curveTo(21f, 4.61597f, 21f, 5.41166f, 21f, 7.00304f)
        verticalLineTo(16.997f)
        curveTo(21f, 18.5883f, 21f, 19.384f, 20.6073f, 19.9991f)
        curveTo(20.5372f, 20.109f, 20.4586f, 20.2132f, 20.3722f, 20.3108f)
        curveTo(19.8886f, 20.8572f, 19.1233f, 21.0758f, 17.5929f, 21.513f)
        curveTo(16.0586f, 21.9513f, 15.2914f, 22.1704f, 14.736f, 21.8417f)
        curveTo(14.6396f, 21.7847f, 14.55f, 21.7171f, 14.4687f, 21.6402f)
        curveTo(14f, 21.1965f, 14f, 20.3988f, 14f, 18.8034f)
        verticalLineTo(5.19662f)
        curveTo(14f, 3.60122f, 14f, 2.80351f, 14.4687f, 2.35982f)
        curveTo(14.55f, 2.28288f, 14.6396f, 2.21527f, 14.736f, 2.15827f)
        curveTo(15.2914f, 1.82956f, 16.0586f, 2.0487f, 17.5929f, 2.48699f)
        curveTo(19.1233f, 2.92418f, 19.8886f, 3.14278f, 20.3722f, 3.68925f)
        curveTo(20.4586f, 3.78684f, 20.5372f, 3.89103f, 20.6073f, 4.00087f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 4f)
        horizontalLineTo(11.9829f)
        curveTo(10.0812f, 4f, 9.13039f, 4f, 8.5396f, 4.58579f)
        curveTo(8.21023f, 4.91238f, 8.06449f, 5.34994f, 8f, 6f)
        moveTo(14f, 20f)
        horizontalLineTo(11.9829f)
        curveTo(10.0812f, 20f, 9.13039f, 20f, 8.5396f, 19.4142f)
        curveTo(8.21023f, 19.0876f, 8.06449f, 18.6501f, 8f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 12f)
        horizontalLineTo(3f)
        moveTo(8.50005f, 9.49994f)
        curveTo(8.50005f, 9.49994f, 11f, 11.3412f, 11f, 12f)
        curveTo(11f, 12.6588f, 8.50003f, 14.4999f, 8.50003f, 14.4999f)
        }
        }.build()

        return _login02!!
    }

private var _login02: ImageVector? = null
