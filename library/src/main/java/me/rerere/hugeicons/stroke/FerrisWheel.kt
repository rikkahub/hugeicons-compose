package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FerrisWheel: ImageVector
    get() {
        if (_ferrisWheel != null) {
            return _ferrisWheel!!
        }
        _ferrisWheel = ImageVector.Builder(
            name = "FerrisWheel",
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
        moveTo(8f, 22f)
        lineTo(10.6843f, 14.3518f)
        curveTo(11.2346f, 12.7839f, 11.5097f, 12f, 12f, 12f)
        curveTo(12.4903f, 12f, 12.7654f, 12.7839f, 13.3157f, 14.3518f)
        lineTo(16f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 4f)
        curveTo(14f, 5.10457f, 13.1046f, 6f, 12f, 6f)
        curveTo(10.8954f, 6f, 10f, 5.10457f, 10f, 4f)
        curveTo(10f, 2.89543f, 10.8954f, 2f, 12f, 2f)
        curveTo(13.1046f, 2f, 14f, 2.89543f, 14f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 10f)
        curveTo(17.8954f, 10f, 17f, 9.10457f, 17f, 8f)
        curveTo(17f, 6.89543f, 17.8954f, 6f, 19f, 6f)
        curveTo(20.1046f, 6f, 21f, 6.89543f, 21f, 8f)
        curveTo(21f, 9.10457f, 20.1046f, 10f, 19f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 16f)
        curveTo(7f, 17.1046f, 6.10457f, 18f, 5f, 18f)
        curveTo(3.89543f, 18f, 3f, 17.1046f, 3f, 16f)
        curveTo(3f, 14.8954f, 3.89543f, 14f, 5f, 14f)
        curveTo(6.10457f, 14f, 7f, 14.8954f, 7f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7.75f)
        curveTo(7f, 8.85457f, 6.10457f, 9.75f, 5f, 9.75f)
        curveTo(3.89543f, 9.75f, 3f, 8.85457f, 3f, 7.75f)
        curveTo(3f, 6.64543f, 3.89543f, 5.75f, 5f, 5.75f)
        curveTo(6.10457f, 5.75f, 7f, 6.64543f, 7f, 7.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 16f)
        curveTo(21f, 17.1046f, 20.1046f, 18f, 19f, 18f)
        curveTo(17.8954f, 18f, 17f, 17.1046f, 17f, 16f)
        curveTo(17f, 14.8954f, 17.8954f, 14f, 19f, 14f)
        curveTo(20.1046f, 14f, 21f, 14.8954f, 21f, 16f)
        }
        }.build()

        return _ferrisWheel!!
    }

private var _ferrisWheel: ImageVector? = null
