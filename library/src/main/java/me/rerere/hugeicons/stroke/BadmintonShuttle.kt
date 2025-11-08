package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BadmintonShuttle: ImageVector
    get() {
        if (_badmintonShuttle != null) {
            return _badmintonShuttle!!
        }
        _badmintonShuttle = ImageVector.Builder(
            name = "BadmintonShuttle",
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
        moveTo(3.92723f, 4.37944f)
        curveTo(5.01307f, 3.80898f, 6.45414f, 3.52865f, 7.89521f, 4.2222f)
        curveTo(9.94761f, 1.25927f, 14.0524f, 1.25926f, 16.1048f, 4.2222f)
        curveTo(17.5458f, 3.52867f, 18.9868f, 3.80902f, 20.0727f, 4.37943f)
        curveTo(20.575f, 4.64333f, 20.8262f, 4.77528f, 20.9545f, 5.15246f)
        curveTo(21.0827f, 5.52964f, 20.9298f, 5.84896f, 20.6241f, 6.48759f)
        lineTo(16.2167f, 15.6944f)
        curveTo(16.0084f, 16.1294f, 15.9043f, 16.347f, 15.8558f, 16.5489f)
        curveTo(15.8073f, 16.7508f, 15.794f, 17.3092f, 15.7674f, 18.4261f)
        curveTo(15.7215f, 20.3525f, 14.4794f, 22f, 12f, 22f)
        curveTo(9.52061f, 22f, 8.27855f, 20.3525f, 8.23262f, 18.4261f)
        curveTo(8.20598f, 17.3092f, 8.19267f, 16.7508f, 8.14418f, 16.5489f)
        curveTo(8.0957f, 16.347f, 7.99157f, 16.1294f, 7.7833f, 15.6944f)
        lineTo(3.37585f, 6.48751f)
        curveTo(3.07015f, 5.84891f, 2.9173f, 5.52962f, 3.04553f, 5.15244f)
        curveTo(3.17377f, 4.77527f, 3.42492f, 4.64333f, 3.92723f, 4.37944f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 4f)
        lineTo(11f, 17f)
        moveTo(16f, 4f)
        lineTo(13f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        curveTo(7.2f, 13.3333f, 8.8f, 13.3334f, 10f, 12f)
        curveTo(11.2f, 13.3333f, 12.8f, 13.3334f, 14f, 12f)
        curveTo(15.2f, 13.3333f, 16.8f, 13.3334f, 18f, 12f)
        }
        }.build()

        return _badmintonShuttle!!
    }

private var _badmintonShuttle: ImageVector? = null
