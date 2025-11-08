package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiPhone01: ImageVector
    get() {
        if (_aiPhone01 != null) {
            return _aiPhone01!!
        }
        _aiPhone01 = ImageVector.Builder(
            name = "AiPhone01",
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
        moveTo(17f, 14.9996f)
        curveTo(17f, 18.2996f, 17f, 19.9496f, 16.0481f, 20.9748f)
        curveTo(15.0962f, 22f, 13.5641f, 22f, 10.5f, 22f)
        curveTo(7.43587f, 22f, 5.90381f, 22f, 4.9519f, 20.9748f)
        curveTo(4f, 19.9496f, 4f, 18.2996f, 4f, 14.9996f)
        verticalLineTo(8.99919f)
        curveTo(4f, 5.69916f, 4f, 4.04914f, 4.9519f, 3.02395f)
        curveTo(5.80236f, 2.10801f, 7.11592f, 2.0104f, 9.57143f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 4f)
        horizontalLineTo(14f)
        curveTo(13.0572f, 4f, 12.5858f, 4f, 12.2929f, 4.29289f)
        curveTo(12f, 4.58579f, 12f, 5.05719f, 12f, 6f)
        verticalLineTo(8f)
        curveTo(12f, 8.94281f, 12f, 9.41421f, 12.2929f, 9.70711f)
        curveTo(12.5858f, 10f, 13.0572f, 10f, 14f, 10f)
        horizontalLineTo(16f)
        curveTo(16.9428f, 10f, 17.4142f, 10f, 17.7071f, 9.70711f)
        curveTo(18f, 9.41421f, 18f, 8.94281f, 18f, 8f)
        verticalLineTo(6f)
        curveTo(18f, 5.05719f, 18f, 4.58579f, 17.7071f, 4.29289f)
        curveTo(17.4142f, 4f, 16.9428f, 4f, 16f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 10f)
        verticalLineTo(12f)
        moveTo(16.5f, 10f)
        verticalLineTo(12f)
        moveTo(13.5f, 2f)
        verticalLineTo(4f)
        moveTo(16.5f, 2f)
        verticalLineTo(4f)
        moveTo(12f, 5.5f)
        horizontalLineTo(10f)
        moveTo(12f, 8.5f)
        horizontalLineTo(10f)
        moveTo(20f, 5.5f)
        horizontalLineTo(18f)
        moveTo(20f, 8.5f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.49f, 19f)
        horizontalLineTo(10.499f)
        }
        }.build()

        return _aiPhone01!!
    }

private var _aiPhone01: ImageVector? = null
