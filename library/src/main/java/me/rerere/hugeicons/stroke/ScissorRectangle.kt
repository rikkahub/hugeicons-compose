package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScissorRectangle: ImageVector
    get() {
        if (_scissorRectangle != null) {
            return _scissorRectangle!!
        }
        _scissorRectangle = ImageVector.Builder(
            name = "ScissorRectangle",
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 9.5f)
        lineTo(11f, 12f)
        moveTo(11f, 12f)
        lineTo(7f, 16f)
        moveTo(11f, 12f)
        lineTo(13.5f, 14.5f)
        moveTo(11f, 12f)
        lineTo(7f, 8f)
        moveTo(17f, 8f)
        curveTo(17f, 9.10457f, 16.1046f, 10f, 15f, 10f)
        curveTo(13.8954f, 10f, 13f, 9.10457f, 13f, 8f)
        curveTo(13f, 6.89543f, 13.8954f, 6f, 15f, 6f)
        curveTo(16.1046f, 6f, 17f, 6.89543f, 17f, 8f)
        moveTo(17f, 16f)
        curveTo(17f, 17.1046f, 16.1046f, 18f, 15f, 18f)
        curveTo(13.8954f, 18f, 13f, 17.1046f, 13f, 16f)
        curveTo(13f, 14.8954f, 13.8954f, 14f, 15f, 14f)
        curveTo(16.1046f, 14f, 17f, 14.8954f, 17f, 16f)
        }
        }.build()

        return _scissorRectangle!!
    }

private var _scissorRectangle: ImageVector? = null
