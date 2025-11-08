package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GreekHelmet: ImageVector
    get() {
        if (_greekHelmet != null) {
            return _greekHelmet!!
        }
        _greekHelmet = ImageVector.Builder(
            name = "GreekHelmet",
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
        moveTo(9f, 14f)
        curveTo(7f, 14f, 5.83322f, 17.6296f, 5.99988f, 19f)
        curveTo(4.14859f, 17.1983f, 3f, 14.6877f, 3f, 11.9108f)
        curveTo(3f, 6.76287f, 6.94721f, 2.53019f, 12.001f, 2.03275f)
        curveTo(12.4478f, 1.98877f, 12.6712f, 1.96677f, 12.8354f, 2.11575f)
        curveTo(13.3348f, 2.56889f, 12.9996f, 4.36144f, 12.9996f, 4.96193f)
        curveTo(13.7789f, 4.30632f, 15.0114f, 2.72457f, 16.0759f, 2.57041f)
        curveTo(16.358f, 2.52957f, 16.58f, 2.62656f, 17.0239f, 2.82052f)
        curveTo(18.6063f, 3.51193f, 19.974f, 4.59861f, 21f, 5.95462f)
        curveTo(21f, 5.95462f, 17.5f, 6.48813f, 16.9994f, 8.9327f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.1566f, 12.658f)
        curveTo(19.789f, 9.67865f, 17.7759f, 8f, 14.4972f, 8f)
        curveTo(9.90074f, 8f, 7.84028f, 13.0457f, 9.7103f, 17.0916f)
        curveTo(9.96239f, 17.6371f, 9.73364f, 18.3581f, 9.5865f, 18.907f)
        curveTo(9.10408f, 20.7065f, 8.86287f, 21.6063f, 9.08073f, 21.8176f)
        curveTo(9.2986f, 22.0289f, 10.0823f, 21.7996f, 11.6497f, 21.3409f)
        curveTo(13.0596f, 20.9284f, 15.0623f, 19.8633f, 16.5629f, 20.0289f)
        curveTo(17.493f, 20.1316f, 20.0349f, 22.4885f, 20.8339f, 21.9082f)
        curveTo(21.1025f, 21.7132f, 21.0072f, 21.2394f, 20.8167f, 20.2919f)
        lineTo(20.385f, 18.1442f)
        curveTo(20.2456f, 17.4512f, 20.0588f, 17.3686f, 19.3707f, 17.225f)
        curveTo(18.1757f, 16.9757f, 17.2936f, 16.2442f, 16.8599f, 15.7039f)
        curveTo(16.6029f, 15.3838f, 16.6536f, 15.1174f, 16.9265f, 14.8268f)
        curveTo(17.6835f, 14.0208f, 18.4639f, 13.7839f, 19.1785f, 13.716f)
        curveTo(19.9976f, 13.6382f, 20.2609f, 13.5026f, 20.1566f, 12.658f)
        }
        }.build()

        return _greekHelmet!!
    }

private var _greekHelmet: ImageVector? = null
