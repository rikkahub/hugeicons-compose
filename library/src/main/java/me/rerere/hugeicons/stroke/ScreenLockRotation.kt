package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScreenLockRotation: ImageVector
    get() {
        if (_screenLockRotation != null) {
            return _screenLockRotation!!
        }
        _screenLockRotation = ImageVector.Builder(
            name = "ScreenLockRotation",
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
        moveTo(12.0339f, 3.74684f)
        curveTo(11.735f, 3.60141f, 11.4456f, 3.52354f, 11.1423f, 3.51237f)
        curveTo(10.0481f, 3.47207f, 9.20024f, 4.31523f, 7.50449f, 6.00155f)
        curveTo(5.80873f, 7.68786f, 4.96085f, 8.53102f, 5.00138f, 9.61906f)
        curveTo(5.0419f, 10.7071f, 5.955f, 11.6151f, 7.7812f, 13.4311f)
        lineTo(11.1017f, 16.7332f)
        curveTo(12.9279f, 18.5492f, 13.841f, 19.4573f, 14.9352f, 19.4975f)
        curveTo(16.0293f, 19.5378f, 16.8772f, 18.6947f, 18.5729f, 17.0084f)
        curveTo(19.9404f, 15.6485f, 20.7565f, 14.8369f, 21f, 14.0031f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.99999f, 12.5042f)
        curveTo(3.1182f, 15.3761f, 4.97783f, 20.9955f, 11.3699f, 21.4774f)
        curveTo(11.7462f, 21.5058f, 11.9344f, 21.5199f, 11.9883f, 21.406f)
        curveTo(12.0423f, 21.292f, 11.9063f, 21.1598f, 11.6344f, 20.8955f)
        lineTo(10.4137f, 19.7092f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.7365f, 5.67839f)
        lineTo(15.7365f, 4.28742f)
        curveTo(15.7365f, 4.08196f, 15.7451f, 3.87395f, 15.8187f, 3.68209f)
        curveTo(16.0148f, 3.17138f, 16.5341f, 2.50232f, 17.4796f, 2.50232f)
        curveTo(18.4251f, 2.50232f, 18.9648f, 3.17138f, 19.1609f, 3.68209f)
        curveTo(19.2345f, 3.87395f, 19.2431f, 4.08196f, 19.2431f, 4.28742f)
        lineTo(19.2431f, 5.67839f)
        moveTo(15.806f, 11.5039f)
        horizontalLineTo(19.194f)
        curveTo(20.1914f, 11.5039f, 21f, 10.6969f, 21f, 9.70151f)
        verticalLineTo(7.69927f)
        curveTo(21f, 6.70385f, 20.1914f, 5.89691f, 19.194f, 5.89691f)
        horizontalLineTo(15.806f)
        curveTo(14.8086f, 5.89691f, 14f, 6.70385f, 14f, 7.69927f)
        verticalLineTo(9.70151f)
        curveTo(14f, 10.6969f, 14.8086f, 11.5039f, 15.806f, 11.5039f)
        }
        }.build()

        return _screenLockRotation!!
    }

private var _screenLockRotation: ImageVector? = null
