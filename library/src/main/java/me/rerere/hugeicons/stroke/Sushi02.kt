package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sushi02: ImageVector
    get() {
        if (_sushi02 != null) {
            return _sushi02!!
        }
        _sushi02 = ImageVector.Builder(
            name = "Sushi02",
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
        moveTo(13f, 9f)
        curveTo(13f, 10.1046f, 13.8954f, 11f, 15f, 11f)
        curveTo(16.1046f, 11f, 17f, 10.1046f, 17f, 9f)
        curveTo(17f, 7.89543f, 16.1046f, 7f, 15f, 7f)
        curveTo(13.8954f, 7f, 13f, 7.89543f, 13f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 9f)
        curveTo(10f, 11.7614f, 12.2386f, 14f, 15f, 14f)
        curveTo(17.7614f, 14f, 20f, 11.7614f, 20f, 9f)
        curveTo(20f, 6.23858f, 17.7614f, 4f, 15f, 4f)
        curveTo(12.2386f, 4f, 10f, 6.23858f, 10f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 2f)
        lineTo(7.53669f, 16.412f)
        moveTo(6f, 22f)
        lineTo(6.825f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12.5f)
        lineTo(2f, 18f)
        }
        }.build()

        return _sushi02!!
    }

private var _sushi02: ImageVector? = null
