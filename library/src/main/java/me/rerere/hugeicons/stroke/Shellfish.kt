package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Shellfish: ImageVector
    get() {
        if (_shellfish != null) {
            return _shellfish!!
        }
        _shellfish = ImageVector.Builder(
            name = "Shellfish",
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
        moveTo(14.5457f, 4.95548f)
        curveTo(14.6207f, 5.26464f, 14.6405f, 5.59372f, 14.5947f, 5.93067f)
        lineTo(13.7727f, 11.975f)
        moveTo(14.5457f, 4.95548f)
        curveTo(13.9137f, 2.34817f, 10.0863f, 2.34817f, 9.45425f, 4.95548f)
        moveTo(14.5457f, 4.95548f)
        curveTo(16.113f, 3.34704f, 18.9261f, 4.94832f, 19f, 6.95915f)
        moveTo(19f, 6.95915f)
        curveTo(20f, 7.12691f, 22f, 8.0641f, 22f, 10.4708f)
        curveTo(22f, 12.6443f, 19.3928f, 14.94f, 16.8169f, 16.7647f)
        curveTo(16.2348f, 17.1771f, 15.9437f, 17.3833f, 15.7575f, 17.5326f)
        curveTo(15.1829f, 17.9935f, 14.8201f, 18.3672f, 14.3765f, 18.9552f)
        curveTo(14.2328f, 19.1457f, 14.0838f, 19.3697f, 13.786f, 19.8177f)
        lineTo(13.5536f, 20.1673f)
        curveTo(13.2078f, 20.6874f, 12.6246f, 21f, 12f, 21f)
        curveTo(11.3754f, 21f, 10.7922f, 20.6874f, 10.4464f, 20.1673f)
        lineTo(10.214f, 19.8177f)
        curveTo(9.91617f, 19.3697f, 9.76725f, 19.1457f, 9.62352f, 18.9552f)
        curveTo(9.1799f, 18.3672f, 8.81709f, 17.9935f, 8.2425f, 17.5326f)
        curveTo(8.05634f, 17.3833f, 7.76522f, 17.1771f, 7.18308f, 16.7647f)
        curveTo(4.60719f, 14.94f, 2f, 12.6443f, 2f, 10.4708f)
        curveTo(2f, 8.0641f, 4f, 7.12691f, 5f, 6.95915f)
        moveTo(19f, 6.95915f)
        curveTo(19.0676f, 8.79881f, 17.8104f, 11.2684f, 16.6976f, 12.9777f)
        moveTo(9.45425f, 4.95548f)
        curveTo(9.37931f, 5.26464f, 9.35952f, 5.59372f, 9.40534f, 5.93067f)
        lineTo(10.2273f, 11.975f)
        moveTo(9.45425f, 4.95548f)
        curveTo(7.88696f, 3.34704f, 5.07389f, 4.94832f, 5f, 6.95915f)
        moveTo(5f, 6.95915f)
        curveTo(4.93239f, 8.79881f, 6.18965f, 11.2684f, 7.30238f, 12.9777f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 16f)
        lineTo(17.2412f, 19.7942f)
        curveTo(17.1009f, 20.4953f, 16.4853f, 21f, 15.7703f, 21f)
        horizontalLineTo(8.22971f)
        curveTo(7.51468f, 21f, 6.89906f, 20.4953f, 6.75883f, 19.7942f)
        lineTo(6f, 16f)
        }
        }.build()

        return _shellfish!!
    }

private var _shellfish: ImageVector? = null
