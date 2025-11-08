package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiFile: ImageVector
    get() {
        if (_aiFile != null) {
            return _aiFile!!
        }
        _aiFile = ImageVector.Builder(
            name = "AiFile",
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
        moveTo(19f, 11.0032f)
        verticalLineTo(10f)
        curveTo(19f, 6.22876f, 19f, 4.34315f, 17.8284f, 3.17157f)
        curveTo(16.6569f, 2f, 14.7712f, 2f, 11f, 2f)
        horizontalLineTo(10.0082f)
        lineTo(3f, 8.98648f)
        verticalLineTo(14.0062f)
        curveTo(3f, 17.7714f, 3f, 19.654f, 4.16811f, 20.825f)
        lineTo(4.17504f, 20.8319f)
        curveTo(5.34602f, 22f, 7.2286f, 22f, 10.9938f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9.00195f)
        horizontalLineTo(4f)
        curveTo(6.82843f, 9.00195f, 8.24264f, 9.00195f, 9.12132f, 8.12327f)
        curveTo(10f, 7.24459f, 10f, 5.83038f, 10f, 3.00195f)
        verticalLineTo(2.00195f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.4069f, 21.5983f)
        curveTo(16.6192f, 22.1365f, 17.3808f, 22.1365f, 17.5931f, 21.5983f)
        lineTo(17.6298f, 21.5051f)
        curveTo(18.1482f, 20.1906f, 19.1887f, 19.1502f, 20.5031f, 18.6318f)
        lineTo(20.5964f, 18.595f)
        curveTo(21.1345f, 18.3828f, 21.1345f, 17.6211f, 20.5964f, 17.4089f)
        lineTo(20.5031f, 17.3721f)
        curveTo(19.1887f, 16.8537f, 18.1482f, 15.8133f, 17.6298f, 14.4989f)
        lineTo(17.5931f, 14.4056f)
        curveTo(17.3808f, 13.8674f, 16.6192f, 13.8674f, 16.4069f, 14.4056f)
        lineTo(16.3702f, 14.4989f)
        curveTo(15.8518f, 15.8133f, 14.8113f, 16.8537f, 13.4969f, 17.3721f)
        lineTo(13.4036f, 17.4089f)
        curveTo(12.8655f, 17.6211f, 12.8655f, 18.3828f, 13.4036f, 18.595f)
        lineTo(13.4969f, 18.6318f)
        curveTo(14.8113f, 19.1502f, 15.8518f, 20.1906f, 16.3702f, 21.5051f)
        lineTo(16.4069f, 21.5983f)
        }
        }.build()

        return _aiFile!!
    }

private var _aiFile: ImageVector? = null
