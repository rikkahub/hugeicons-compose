package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fuel: ImageVector
    get() {
        if (_fuel != null) {
            return _fuel!!
        }
        _fuel = ImageVector.Builder(
            name = "Fuel",
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
        moveTo(5f, 6f)
        verticalLineTo(5.5f)
        curveTo(5f, 4.55719f, 5f, 4.08579f, 5.29289f, 3.79289f)
        curveTo(5.58579f, 3.5f, 6.05719f, 3.5f, 7f, 3.5f)
        curveTo(7.94281f, 3.5f, 8.41421f, 3.5f, 8.70711f, 3.79289f)
        curveTo(9f, 4.08579f, 9f, 4.55719f, 9f, 5.5f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 5f)
        lineTo(18f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 2f)
        horizontalLineTo(14.6667f)
        curveTo(12.7932f, 2f, 12f, 2.93374f, 12f, 4.66667f)
        curveTo(12f, 5.53313f, 11.6034f, 6f, 10.6667f, 6f)
        horizontalLineTo(7f)
        curveTo(5.11438f, 6f, 4.17157f, 6f, 3.58579f, 6.58579f)
        curveTo(3f, 7.17157f, 3f, 8.11438f, 3f, 10f)
        verticalLineTo(15f)
        curveTo(3f, 18.2998f, 3f, 19.9497f, 4.02513f, 20.9749f)
        curveTo(5.05025f, 22f, 6.70017f, 22f, 10f, 22f)
        horizontalLineTo(14f)
        curveTo(17.2998f, 22f, 18.9497f, 22f, 19.9749f, 20.9749f)
        curveTo(21f, 19.9497f, 21f, 18.2998f, 21f, 15f)
        verticalLineTo(7f)
        curveTo(21f, 4.64298f, 21f, 3.46447f, 20.2678f, 2.73223f)
        curveTo(19.5355f, 2f, 18.357f, 2f, 16f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 14.5873f)
        curveTo(9f, 13.1229f, 10.2638f, 11.6757f, 11.1509f, 10.8403f)
        curveTo(11.6326f, 10.3866f, 12.3674f, 10.3866f, 12.8491f, 10.8403f)
        curveTo(13.7362f, 11.6757f, 15f, 13.1229f, 15f, 14.5873f)
        curveTo(15f, 16.0231f, 13.864f, 17.5f, 12f, 17.5f)
        curveTo(10.136f, 17.5f, 9f, 16.0231f, 9f, 14.5873f)
        }
        }.build()

        return _fuel!!
    }

private var _fuel: ImageVector? = null
