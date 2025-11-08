package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Spaceship: ImageVector
    get() {
        if (_spaceship != null) {
            return _spaceship!!
        }
        _spaceship = ImageVector.Builder(
            name = "Spaceship",
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
        moveTo(12f, 3f)
        curveTo(9.05058f, 3f, 6.59627f, 5.11144f, 6.07743f, 7.8996f)
        curveTo(5.9907f, 8.36569f, 5.94733f, 8.59873f, 6.1089f, 8.90532f)
        curveTo(6.27048f, 9.2119f, 6.49914f, 9.31381f, 6.95646f, 9.51763f)
        curveTo(8.33509f, 10.1321f, 10.0897f, 10.5f, 12f, 10.5f)
        curveTo(13.9103f, 10.5f, 15.6649f, 10.1321f, 17.0435f, 9.51763f)
        curveTo(17.5009f, 9.31381f, 17.7295f, 9.2119f, 17.8911f, 8.90532f)
        curveTo(18.0527f, 8.59873f, 18.0093f, 8.36569f, 17.9226f, 7.8996f)
        curveTo(17.4037f, 5.11144f, 14.9494f, 3f, 12f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 5.5f)
        curveTo(19.989f, 6.28752f, 22f, 7.75946f, 22f, 9.44533f)
        curveTo(22f, 11.9608f, 17.5228f, 14f, 12f, 14f)
        curveTo(6.47715f, 14f, 2f, 11.9608f, 2f, 9.44533f)
        curveTo(2f, 7.75946f, 4.01099f, 6.28752f, 7f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 17f)
        lineTo(18f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17f)
        lineTo(6f, 21f)
        }
        }.build()

        return _spaceship!!
    }

private var _spaceship: ImageVector? = null
