package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TestTube: ImageVector
    get() {
        if (_testTube != null) {
            return _testTube!!
        }
        _testTube = ImageVector.Builder(
            name = "TestTube",
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
        moveTo(11.223f, 6f)
        verticalLineTo(7.98898f)
        curveTo(11.223f, 9.38733f, 11.223f, 10.0865f, 11.4102f, 10.7577f)
        curveTo(11.5974f, 11.4289f, 11.9644f, 12.0452f, 12.6984f, 13.2779f)
        lineTo(13.6929f, 14.9482f)
        curveTo(15.5632f, 18.0892f, 16.4984f, 19.6597f, 15.7312f, 20.824f)
        lineTo(15.7193f, 20.8418f)
        curveTo(14.9409f, 22f, 12.9606f, 22f, 9f, 22f)
        curveTo(5.03938f, 22f, 3.05907f, 22f, 2.2807f, 20.8418f)
        lineTo(2.26884f, 20.824f)
        curveTo(1.50164f, 19.6597f, 2.43679f, 18.0892f, 4.30708f, 14.9482f)
        lineTo(5.30163f, 13.2779f)
        curveTo(6.03558f, 12.0452f, 6.40256f, 11.4289f, 6.5898f, 10.7577f)
        curveTo(6.77704f, 10.0865f, 6.77704f, 9.38733f, 6.77704f, 7.98898f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6f)
        lineTo(12f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 13.2803f)
        curveTo(6.16667f, 12.699f, 7.73448f, 13.1181f, 9.00155f, 13.6643f)
        curveTo(10.6682f, 14.3828f, 12.1667f, 13.8019f, 12.5f, 13.2803f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 7f)
        curveTo(11.5f, 9f, 13.8624f, 11.2121f, 15.4728f, 11f)
        curveTo(15.4728f, 12.6569f, 16.934f, 14f, 18.7364f, 14f)
        curveTo(20.5388f, 14f, 22f, 12.6569f, 22f, 11f)
        curveTo(22f, 9.34315f, 21f, 8f, 19f, 8f)
        curveTo(19f, 6f, 17.5f, 4f, 15.3799f, 4f)
        curveTo(15.3799f, 2.45687f, 14.5f, 2f, 13.5f, 2f)
        curveTo(12.5f, 2f, 12f, 3f, 12f, 3f)
        curveTo(12f, 3f, 9f, 3f, 9f, 6f)
        }
        }.build()

        return _testTube!!
    }

private var _testTube: ImageVector? = null
