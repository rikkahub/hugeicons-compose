package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Spaghetti: ImageVector
    get() {
        if (_spaghetti != null) {
            return _spaghetti!!
        }
        _spaghetti = ImageVector.Builder(
            name = "Spaghetti",
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
        moveTo(21.2916f, 13f)
        horizontalLineTo(2.70845f)
        curveTo(1.18885f, 13f, 2.48394f, 15.238f, 3.16941f, 15.581f)
        lineTo(5.53031f, 16.7625f)
        curveTo(5.76629f, 16.8806f, 5.88428f, 16.9396f, 5.98205f, 17.026f)
        curveTo(6.86002f, 17.8017f, 7.02027f, 19.169f, 8.12986f, 19.7633f)
        curveTo(8.57168f, 20f, 9.09521f, 20f, 10.1423f, 20f)
        horizontalLineTo(13.8577f)
        curveTo(14.9048f, 20f, 15.4283f, 20f, 15.8701f, 19.7633f)
        curveTo(16.9797f, 19.169f, 17.14f, 17.8017f, 18.018f, 17.026f)
        curveTo(18.1157f, 16.9396f, 18.2337f, 16.8806f, 18.4697f, 16.7625f)
        lineTo(20.8306f, 15.581f)
        curveTo(21.5161f, 15.238f, 22.8112f, 13f, 21.2916f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 13f)
        curveTo(15f, 9.68629f, 12.3137f, 7f, 9f, 7f)
        curveTo(5.68629f, 7f, 3f, 9.68629f, 3f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13f)
        curveTo(21f, 10.2386f, 18.7749f, 8f, 16.03f, 8f)
        curveTo(15.1061f, 8f, 14.2411f, 8.25382f, 13.5f, 8.69575f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 12.2222f)
        curveTo(7f, 10.9949f, 7.89543f, 10f, 9f, 10f)
        curveTo(10.1046f, 10f, 11f, 10.9949f, 11f, 12.2222f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 6.55561f)
        curveTo(9.43124f, 4.79022f, 11.3282f, 3.68242f, 13.2369f, 4.08128f)
        curveTo(15.1456f, 4.48014f, 16.3434f, 6.23461f, 15.9121f, 8f)
        }
        }.build()

        return _spaghetti!!
    }

private var _spaghetti: ImageVector? = null
