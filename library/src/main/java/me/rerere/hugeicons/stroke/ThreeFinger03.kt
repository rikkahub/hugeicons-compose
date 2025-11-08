package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThreeFinger03: ImageVector
    get() {
        if (_threeFinger03 != null) {
            return _threeFinger03!!
        }
        _threeFinger03 = ImageVector.Builder(
            name = "ThreeFinger03",
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
        moveTo(11.5004f, 6f)
        curveTo(11.5004f, 5.17157f, 10.8289f, 4.5f, 10.0004f, 4.5f)
        curveTo(9.172f, 4.5f, 8.50042f, 5.17157f, 8.50042f, 6f)
        verticalLineTo(13.9627f)
        lineTo(6.8797f, 12.3369f)
        curveTo(6.16877f, 11.6237f, 4.99772f, 11.6888f, 4.36965f, 12.4763f)
        curveTo(3.88907f, 13.0789f, 3.8758f, 13.9314f, 4.33738f, 14.5487f)
        lineTo(7.34137f, 18.5667f)
        curveTo(8.02311f, 19.4785f, 8.36398f, 19.9344f, 8.77419f, 20.2888f)
        curveTo(9.40001f, 20.8294f, 10.1499f, 21.2056f, 10.9566f, 21.3834f)
        curveTo(11.4853f, 21.5f, 12.0534f, 21.5f, 13.1896f, 21.5f)
        curveTo(15.3562f, 21.5f, 16.4395f, 21.5f, 17.3019f, 21.1679f)
        curveTo(18.6207f, 20.6601f, 19.6627f, 19.6148f, 20.1689f, 18.2918f)
        curveTo(20.5f, 17.4267f, 20.5f, 16.34f, 20.5f, 14.1667f)
        verticalLineTo(11.5f)
        curveTo(20.5f, 10.3954f, 19.605f, 9.5f, 18.5004f, 9.5f)
        horizontalLineTo(17.5004f)
        moveTo(11.5004f, 6f)
        verticalLineTo(4f)
        curveTo(11.5004f, 3.17157f, 12.172f, 2.5f, 13.0004f, 2.5f)
        curveTo(13.8289f, 2.5f, 14.5004f, 3.17157f, 14.5004f, 4f)
        verticalLineTo(6f)
        moveTo(11.5004f, 6f)
        verticalLineTo(10.5f)
        moveTo(14.5004f, 6f)
        verticalLineTo(10.5f)
        moveTo(14.5004f, 6f)
        curveTo(14.5004f, 5.17157f, 15.172f, 4.5f, 16.0004f, 4.5f)
        curveTo(16.8289f, 4.5f, 17.5004f, 5.17157f, 17.5004f, 6f)
        verticalLineTo(9.5f)
        moveTo(17.5004f, 9.5f)
        verticalLineTo(11.5f)
        }
        }.build()

        return _threeFinger03!!
    }

private var _threeFinger03: ImageVector? = null
