package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hat: ImageVector
    get() {
        if (_hat != null) {
            return _hat!!
        }
        _hat = ImageVector.Builder(
            name = "Hat",
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
        moveTo(4.5f, 14f)
        lineTo(2.34718f, 15.7223f)
        curveTo(2.12774f, 15.8978f, 2f, 16.1636f, 2f, 16.4446f)
        curveTo(2f, 16.7864f, 2.18686f, 17.1029f, 2.49648f, 17.2477f)
        curveTo(4.78892f, 18.3202f, 8.19601f, 19f, 12f, 19f)
        curveTo(15.804f, 19f, 19.2111f, 18.3202f, 21.5035f, 17.2477f)
        curveTo(21.8131f, 17.1029f, 22f, 16.7864f, 22f, 16.4446f)
        curveTo(22f, 16.1636f, 21.8723f, 15.8978f, 21.6528f, 15.7223f)
        lineTo(19.5f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        curveTo(15.0669f, 15f, 17.7898f, 14.6072f, 19.5f, 14f)
        lineTo(19.093f, 10.3374f)
        curveTo(18.811f, 7.79862f, 18.6699f, 6.52923f, 17.8156f, 5.76462f)
        curveTo(16.9614f, 5f, 15.6842f, 5f, 13.1297f, 5f)
        horizontalLineTo(10.8703f)
        curveTo(8.31585f, 5f, 7.03864f, 5f, 6.18436f, 5.76462f)
        curveTo(5.33009f, 6.52923f, 5.18904f, 7.79862f, 4.90695f, 10.3374f)
        lineTo(4.5f, 14f)
        curveTo(6.21023f, 14.6072f, 8.93312f, 15f, 12f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 10f)
        horizontalLineTo(13f)
        }
        }.build()

        return _hat!!
    }

private var _hat: ImageVector? = null
