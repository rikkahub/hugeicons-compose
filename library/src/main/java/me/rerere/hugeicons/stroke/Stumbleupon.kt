package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stumbleupon: ImageVector
    get() {
        if (_stumbleupon != null) {
            return _stumbleupon!!
        }
        _stumbleupon = ImageVector.Builder(
            name = "Stumbleupon",
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
        moveTo(18f, 13f)
        verticalLineTo(15f)
        curveTo(18f, 16.1046f, 17.1046f, 17f, 16f, 17f)
        curveTo(14.8954f, 17f, 14f, 16.1046f, 14f, 15f)
        verticalLineTo(13f)
        moveTo(6f, 13f)
        verticalLineTo(15f)
        curveTo(6f, 16.1046f, 6.89543f, 17f, 8f, 17f)
        curveTo(9.10457f, 17f, 10f, 16.1046f, 10f, 15f)
        verticalLineTo(9f)
        curveTo(10f, 7.89543f, 10.8954f, 7f, 12f, 7f)
        curveTo(13.1046f, 7f, 14f, 7.89543f, 14f, 9f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }
        }.build()

        return _stumbleupon!!
    }

private var _stumbleupon: ImageVector? = null
