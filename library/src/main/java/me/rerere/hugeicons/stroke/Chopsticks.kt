package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chopsticks: ImageVector
    get() {
        if (_chopsticks != null) {
            return _chopsticks!!
        }
        _chopsticks = ImageVector.Builder(
            name = "Chopsticks",
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
        moveTo(16.4548f, 9.76893f)
        lineTo(18.1572f, 11.4713f)
        moveTo(13.7311f, 8.04518f)
        lineTo(12.0287f, 6.34283f)
        moveTo(20.5523f, 7.05701f)
        lineTo(21.2095f, 7.71427f)
        curveTo(21.6057f, 8.11046f, 21.5952f, 8.75196f, 21.1865f, 9.12111f)
        lineTo(8.30613f, 20.7545f)
        curveTo(7.92529f, 21.0985f, 7.33645f, 21.0787f, 6.96729f, 20.7095f)
        lineTo(6.93352f, 20.6758f)
        curveTo(6.55091f, 20.2932f, 6.54562f, 19.6781f, 6.92169f, 19.3021f)
        lineTo(19.1786f, 7.04518f)
        curveTo(19.5546f, 6.6691f, 20.1697f, 6.6744f, 20.5523f, 7.05701f)
        moveTo(16.443f, 3.94772f)
        lineTo(15.7857f, 3.29045f)
        curveTo(15.3895f, 2.89426f, 14.748f, 2.90477f, 14.3789f, 3.3135f)
        lineTo(2.74549f, 16.1939f)
        curveTo(2.40152f, 16.5747f, 2.4213f, 17.1636f, 2.79046f, 17.5327f)
        lineTo(2.82423f, 17.5665f)
        curveTo(3.20683f, 17.9491f, 3.82186f, 17.9544f, 4.19793f, 17.5783f)
        lineTo(16.4548f, 5.32142f)
        curveTo(16.8309f, 4.94535f, 16.8256f, 4.33032f, 16.443f, 3.94772f)
        }
        }.build()

        return _chopsticks!!
    }

private var _chopsticks: ImageVector? = null
