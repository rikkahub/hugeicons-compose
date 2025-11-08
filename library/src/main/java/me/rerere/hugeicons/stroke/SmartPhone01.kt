package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SmartPhone01: ImageVector
    get() {
        if (_smartPhone01 != null) {
            return _smartPhone01!!
        }
        _smartPhone01 = ImageVector.Builder(
            name = "SmartPhone01",
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
        moveTo(12f, 19f)
        horizontalLineTo(12.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 2f)
        horizontalLineTo(10.5f)
        curveTo(8.14298f, 2f, 6.96447f, 2f, 6.23223f, 2.73223f)
        curveTo(5.5f, 3.46447f, 5.5f, 4.64298f, 5.5f, 7f)
        verticalLineTo(17f)
        curveTo(5.5f, 19.357f, 5.5f, 20.5355f, 6.23223f, 21.2678f)
        curveTo(6.96447f, 22f, 8.14298f, 22f, 10.5f, 22f)
        horizontalLineTo(13.5f)
        curveTo(15.857f, 22f, 17.0355f, 22f, 17.7678f, 21.2678f)
        curveTo(18.5f, 20.5355f, 18.5f, 19.357f, 18.5f, 17f)
        verticalLineTo(7f)
        curveTo(18.5f, 4.64298f, 18.5f, 3.46447f, 17.7678f, 2.73223f)
        curveTo(17.0355f, 2f, 15.857f, 2f, 13.5f, 2f)
        }
        }.build()

        return _smartPhone01!!
    }

private var _smartPhone01: ImageVector? = null
