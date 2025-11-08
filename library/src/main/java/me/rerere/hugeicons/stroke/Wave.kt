package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wave: ImageVector
    get() {
        if (_wave != null) {
            return _wave!!
        }
        _wave = ImageVector.Builder(
            name = "Wave",
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
        moveTo(3f, 12f)
        horizontalLineTo(6f)
        curveTo(7.10457f, 12f, 8f, 11.1046f, 8f, 10f)
        verticalLineTo(7f)
        curveTo(8f, 5.89543f, 8.89543f, 5f, 10f, 5f)
        curveTo(11.1046f, 5f, 12f, 5.89543f, 12f, 7f)
        verticalLineTo(17.0002f)
        curveTo(12f, 18.1047f, 12.8953f, 19f, 13.9998f, 19f)
        curveTo(15.1043f, 19f, 15.9996f, 18.1047f, 15.9996f, 17.0002f)
        lineTo(15.9996f, 14f)
        curveTo(15.9996f, 12.8954f, 16.8951f, 12f, 17.9996f, 12f)
        horizontalLineTo(20.9996f)
        }
        }.build()

        return _wave!!
    }

private var _wave: ImageVector? = null
