package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PieChartSquare: ImageVector
    get() {
        if (_pieChartSquare != null) {
            return _pieChartSquare!!
        }
        _pieChartSquare = ImageVector.Builder(
            name = "PieChartSquare",
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
        curveTo(2.5f, 7.77027f, 2.5f, 5.6554f, 3.69797f, 4.25276f)
        curveTo(3.86808f, 4.05358f, 4.05358f, 3.86808f, 4.25276f, 3.69797f)
        curveTo(5.6554f, 2.5f, 7.77027f, 2.5f, 12f, 2.5f)
        curveTo(16.2297f, 2.5f, 18.3446f, 2.5f, 19.7472f, 3.69797f)
        curveTo(19.9464f, 3.86808f, 20.1319f, 4.05358f, 20.302f, 4.25276f)
        curveTo(21.5f, 5.6554f, 21.5f, 7.77027f, 21.5f, 12f)
        curveTo(21.5f, 16.2297f, 21.5f, 18.3446f, 20.302f, 19.7472f)
        curveTo(20.1319f, 19.9464f, 19.9464f, 20.1319f, 19.7472f, 20.302f)
        curveTo(18.3446f, 21.5f, 16.2297f, 21.5f, 12f, 21.5f)
        curveTo(7.77027f, 21.5f, 5.6554f, 21.5f, 4.25276f, 20.302f)
        curveTo(4.05358f, 20.1319f, 3.86808f, 19.9464f, 3.69797f, 19.7472f)
        curveTo(2.5f, 18.3446f, 2.5f, 16.2297f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.1063f, 12.1246f)
        curveTo(16.0897f, 12.172f, 16.5814f, 12.1957f, 16.8597f, 12.6591f)
        curveTo(17.1379f, 13.1224f, 16.9705f, 13.467f, 16.6357f, 14.1562f)
        curveTo(16.4977f, 14.4403f, 16.3324f, 14.7121f, 16.1412f, 14.9678f)
        curveTo(15.5443f, 15.7659f, 14.7221f, 16.3706f, 13.7783f, 16.7057f)
        curveTo(12.8346f, 17.0407f, 11.8118f, 17.091f, 10.8393f, 16.85f)
        curveTo(9.86672f, 16.6091f, 8.98811f, 16.0879f, 8.31455f, 15.3523f)
        curveTo(7.64099f, 14.6166f, 7.20274f, 13.6996f, 7.0552f, 12.7172f)
        curveTo(6.90766f, 11.7347f, 7.05747f, 10.731f, 7.48568f, 9.83294f)
        curveTo(7.91389f, 8.93486f, 8.60127f, 8.18277f, 9.46089f, 7.67175f)
        curveTo(9.73632f, 7.50802f, 10.0255f, 7.3714f, 10.3242f, 7.26291f)
        curveTo(11.049f, 6.99967f, 11.4115f, 6.86805f, 11.8499f, 7.18747f)
        curveTo(12.2883f, 7.50689f, 12.2644f, 7.99405f, 12.2165f, 8.96837f)
        lineTo(12.1672f, 9.97174f)
        curveTo(12.1207f, 10.9175f, 12.0975f, 11.3904f, 12.3796f, 11.6985f)
        curveTo(12.6617f, 12.0067f, 13.139f, 12.0297f, 14.0936f, 12.0757f)
        lineTo(15.1063f, 12.1246f)
        }
        }.build()

        return _pieChartSquare!!
    }

private var _pieChartSquare: ImageVector? = null
