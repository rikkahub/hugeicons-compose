package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = ImageVector.Builder(
            name = "PieChart",
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
        moveTo(20.5f, 15.8278f)
        curveTo(17.9985f, 21.756f, 9.86407f, 23.4835f, 5.20143f, 18.8641f)
        curveTo(0.629484f, 14.3347f, 2.04493f, 6.12883f, 8.05653f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6831f, 12.5f)
        curveTo(19.5708f, 12.5f, 20.5146f, 12.5f, 21.1241f, 11.655f)
        curveTo(21.1469f, 11.6234f, 21.1848f, 11.5667f, 21.2052f, 11.5336f)
        curveTo(21.7527f, 10.6471f, 21.4705f, 9.966f, 20.9063f, 8.60378f)
        curveTo(20.3946f, 7.36853f, 19.6447f, 6.24615f, 18.6993f, 5.30073f)
        curveTo(17.7538f, 4.35531f, 16.6315f, 3.60536f, 15.3962f, 3.0937f)
        curveTo(14.034f, 2.52946f, 13.3529f, 2.24733f, 12.4664f, 2.79477f)
        curveTo(12.4333f, 2.81523f, 12.3766f, 2.85309f, 12.345f, 2.87587f)
        curveTo(11.5f, 3.4854f, 11.5f, 4.42922f, 11.5f, 6.31686f)
        verticalLineTo(8.42748f)
        curveTo(11.5f, 10.3473f, 11.5f, 11.3072f, 12.0964f, 11.9036f)
        curveTo(12.6928f, 12.5f, 13.6527f, 12.5f, 15.5725f, 12.5f)
        horizontalLineTo(17.6831f)
        }
        }.build()

        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
