package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Blood: ImageVector
    get() {
        if (_blood != null) {
            return _blood!!
        }
        _blood = ImageVector.Builder(
            name = "Blood",
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
        moveTo(5.5f, 15.5f)
        curveTo(3.28795f, 14.6166f, 2f, 12.4328f, 2f, 10.1746f)
        curveTo(2f, 7.24571f, 4.31698f, 4.35135f, 5.94326f, 2.68056f)
        curveTo(6.82649f, 1.77315f, 8.17351f, 1.77315f, 9.05674f, 2.68056f)
        curveTo(9.54874f, 3.18602f, 9.96485f, 3.80348f, 10.5f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 14.9263f)
        curveTo(8f, 11.3698f, 10.9489f, 7.85521f, 13.0187f, 5.82639f)
        curveTo(14.1428f, 4.72454f, 15.8572f, 4.72454f, 16.9813f, 5.82639f)
        curveTo(19.0511f, 7.85521f, 22f, 11.3698f, 22f, 14.9263f)
        curveTo(22f, 18.4134f, 19.3492f, 22f, 15f, 22f)
        curveTo(10.6508f, 22f, 8f, 18.4134f, 8f, 14.9263f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 15.5f)
        curveTo(18.5f, 17.7091f, 17f, 18.5f, 15.5f, 18.5f)
        }
        }.build()

        return _blood!!
    }

private var _blood: ImageVector? = null
