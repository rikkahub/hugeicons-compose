package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Underpants03: ImageVector
    get() {
        if (_underpants03 != null) {
            return _underpants03!!
        }
        _underpants03 = ImageVector.Builder(
            name = "Underpants03",
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
        moveTo(14f, 18.5f)
        curveTo(14f, 15.8333f, 15.9f, 10f, 21.5f, 10f)
        moveTo(10f, 18.5f)
        curveTo(10f, 15.8333f, 8.1f, 10f, 2.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 8f)
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        verticalLineTo(9.56091f)
        curveTo(2f, 9.86218f, 2.0252f, 10.134f, 2.10806f, 10.4238f)
        curveTo(2.93715f, 13.3235f, 5.92032f, 17.6665f, 9.52749f, 18.8626f)
        curveTo(9.85085f, 18.9698f, 10.1521f, 19f, 10.4924f, 19f)
        horizontalLineTo(13.5076f)
        curveTo(13.8479f, 19f, 14.1492f, 18.9698f, 14.4725f, 18.8626f)
        curveTo(18.0797f, 17.6665f, 21.0629f, 13.3235f, 21.8919f, 10.4238f)
        curveTo(21.9748f, 10.134f, 22f, 9.86218f, 22f, 9.56091f)
        verticalLineTo(8f)
        curveTo(22f, 6.58579f, 22f, 5.87868f, 21.5607f, 5.43934f)
        curveTo(21.1213f, 5f, 20.4142f, 5f, 19f, 5f)
        horizontalLineTo(5f)
        curveTo(3.58579f, 5f, 2.87868f, 5f, 2.43934f, 5.43934f)
        curveTo(2f, 5.87868f, 2f, 6.58579f, 2f, 8f)
        }
        }.build()

        return _underpants03!!
    }

private var _underpants03: ImageVector? = null
